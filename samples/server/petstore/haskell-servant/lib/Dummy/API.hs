{-# LANGUAGE DataKinds                  #-}
{-# LANGUAGE DeriveDataTypeable         #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE DeriveTraversable          #-}
{-# LANGUAGE FlexibleContexts           #-}
{-# LANGUAGE FlexibleInstances          #-}
{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE OverloadedStrings          #-}
{-# LANGUAGE RecordWildCards            #-}
{-# LANGUAGE TypeFamilies               #-}
{-# LANGUAGE TypeOperators              #-}
{-# LANGUAGE ViewPatterns               #-}
{-# OPTIONS_GHC
-fno-warn-unused-binds -fno-warn-unused-imports -freduction-depth=328 #-}

module Dummy.API
  ( -- * Client and Server
    Config(..)
  , DummyBackend(..)
  , createDummyClient
  , runDummyServer
  , runDummyMiddlewareServer
  , runDummyClient
  , runDummyClientWithManager
  , callDummy
  , DummyClient
  , DummyClientError(..)
  -- ** Servant
  , DummyAPI
  -- ** Plain WAI Application
  , serverWaiApplicationDummy
  ) where

import           Dummy.Types

import           Control.Monad.Catch                (Exception, MonadThrow, throwM)
import           Control.Monad.Except               (ExceptT, runExceptT)
import           Control.Monad.IO.Class
import           Control.Monad.Trans.Reader         (ReaderT (..))
import           Data.Aeson                         (Value)
import           Data.Coerce                        (coerce)
import           Data.Data                          (Data)
import           Data.Function                      ((&))
import qualified Data.Map                           as Map
import           Data.Monoid                        ((<>))
import           Data.Proxy                         (Proxy (..))
import           Data.Set                           (Set)
import           Data.Text                          (Text)
import qualified Data.Text                          as T
import           Data.Time
import           Data.UUID                          (UUID)
import           GHC.Exts                           (IsString (..))
import           GHC.Generics                       (Generic)
import           Network.HTTP.Client                (Manager, newManager)
import           Network.HTTP.Client.TLS            (tlsManagerSettings)
import           Network.HTTP.Types.Method          (methodOptions)
import           Network.Wai                        (Middleware)
import qualified Network.Wai.Handler.Warp           as Warp
import           Servant                            (ServerError, serveWithContextT)
import           Servant.API                        hiding (addHeader)
import           Servant.API.Verbs                  (StdMethod (..), Verb)
import           Servant.Client                     (ClientEnv, Scheme (Http), ClientError, client,
                                                     mkClientEnv, parseBaseUrl)
import           Servant.Client.Core                (baseUrlPort, baseUrlHost)
import           Servant.Client.Internal.HttpClient (ClientM (..))
import           Servant.Server                     (Handler (..), Application, Context (EmptyContext))
import           Servant.Server.StaticFiles         (serveDirectoryFileServer)
import           Web.FormUrlEncoded
import           Web.HttpApiData




-- | List of elements parsed from a query.
newtype QueryList (p :: CollectionFormat) a = QueryList
  { fromQueryList :: [a]
  } deriving (Functor, Applicative, Monad, Foldable, Traversable)

-- | Formats in which a list can be encoded into a HTTP path.
data CollectionFormat
  = CommaSeparated -- ^ CSV format for multiple parameters.
  | SpaceSeparated -- ^ Also called "SSV"
  | TabSeparated -- ^ Also called "TSV"
  | PipeSeparated -- ^ `value1|value2|value2`
  | MultiParamArray -- ^ Using multiple GET parameters, e.g. `foo=bar&foo=baz`. Only for GET params.

instance FromHttpApiData a => FromHttpApiData (QueryList 'CommaSeparated a) where
  parseQueryParam = parseSeparatedQueryList ','

instance FromHttpApiData a => FromHttpApiData (QueryList 'TabSeparated a) where
  parseQueryParam = parseSeparatedQueryList '\t'

instance FromHttpApiData a => FromHttpApiData (QueryList 'SpaceSeparated a) where
  parseQueryParam = parseSeparatedQueryList ' '

instance FromHttpApiData a => FromHttpApiData (QueryList 'PipeSeparated a) where
  parseQueryParam = parseSeparatedQueryList '|'

instance FromHttpApiData a => FromHttpApiData (QueryList 'MultiParamArray a) where
  parseQueryParam = error "unimplemented FromHttpApiData for MultiParamArray collection format"

parseSeparatedQueryList :: FromHttpApiData a => Char -> Text -> Either Text (QueryList p a)
parseSeparatedQueryList char = fmap QueryList . mapM parseQueryParam . T.split (== char)

instance ToHttpApiData a => ToHttpApiData (QueryList 'CommaSeparated a) where
  toQueryParam = formatSeparatedQueryList ','

instance ToHttpApiData a => ToHttpApiData (QueryList 'TabSeparated a) where
  toQueryParam = formatSeparatedQueryList '\t'

instance ToHttpApiData a => ToHttpApiData (QueryList 'SpaceSeparated a) where
  toQueryParam = formatSeparatedQueryList ' '

instance ToHttpApiData a => ToHttpApiData (QueryList 'PipeSeparated a) where
  toQueryParam = formatSeparatedQueryList '|'

instance ToHttpApiData a => ToHttpApiData (QueryList 'MultiParamArray a) where
  toQueryParam = error "unimplemented ToHttpApiData for MultiParamArray collection format"

formatSeparatedQueryList :: ToHttpApiData a => Char ->  QueryList p a -> Text
formatSeparatedQueryList char = T.intercalate (T.singleton char) . map toQueryParam . fromQueryList


-- | Servant type-level API, generated from the OpenAPI spec for Dummy.
type DummyAPI
    =    "example" :> "someMethod" :> Verb 'GET 200 '[JSON] ExampleResponse -- 'dummy' route
    :<|> Raw


-- | Server or client configuration, specifying the host and port to query or serve on.
data Config = Config
  { configUrl :: String  -- ^ scheme://hostname:port/path, e.g. "http://localhost:8080/"
  } deriving (Eq, Ord, Show, Read)


-- | Custom exception type for our errors.
newtype DummyClientError = DummyClientError ClientError
  deriving (Show, Exception)
-- | Configuration, specifying the full url of the service.


-- | Backend for Dummy.
-- The backend can be used both for the client and the server. The client generated from the Dummy OpenAPI spec
-- is a backend that executes actions by sending HTTP requests (see @createDummyClient@). Alternatively, provided
-- a backend, the API can be served using @runDummyMiddlewareServer@.
data DummyBackend m = DummyBackend
  { dummy :: m ExampleResponse{- ^ dummy -}
  }


newtype DummyClient a = DummyClient
  { runClient :: ClientEnv -> ExceptT ClientError IO a
  } deriving Functor

instance Applicative DummyClient where
  pure x = DummyClient (\_ -> pure x)
  (DummyClient f) <*> (DummyClient x) =
    DummyClient (\env -> f env <*> x env)

instance Monad DummyClient where
  (DummyClient a) >>= f =
    DummyClient (\env -> do
      value <- a env
      runClient (f value) env)

instance MonadIO DummyClient where
  liftIO io = DummyClient (\_ -> liftIO io)

createDummyClient :: DummyBackend DummyClient
createDummyClient = DummyBackend{..}
  where
    ((coerce -> dummy) :<|>
     _) = client (Proxy :: Proxy DummyAPI)

-- | Run requests in the DummyClient monad.
runDummyClient :: Config -> DummyClient a -> ExceptT ClientError IO a
runDummyClient clientConfig cl = do
  manager <- liftIO $ newManager tlsManagerSettings
  runDummyClientWithManager manager clientConfig cl

-- | Run requests in the DummyClient monad using a custom manager.
runDummyClientWithManager :: Manager -> Config -> DummyClient a -> ExceptT ClientError IO a
runDummyClientWithManager manager Config{..} cl = do
  url <- parseBaseUrl configUrl
  runClient cl $ mkClientEnv manager url

-- | Like @runClient@, but returns the response or throws
--   a DummyClientError
callDummy
  :: (MonadIO m, MonadThrow m)
  => ClientEnv -> DummyClient a -> m a
callDummy env f = do
  res <- liftIO $ runExceptT $ runClient f env
  case res of
    Left err       -> throwM (DummyClientError err)
    Right response -> pure response


requestMiddlewareId :: Application -> Application
requestMiddlewareId a = a

-- | Run the Dummy server at the provided host and port.
runDummyServer
  :: (MonadIO m, MonadThrow m)
  => Config -> DummyBackend (ExceptT ServerError IO) -> m ()
runDummyServer config backend = runDummyMiddlewareServer config requestMiddlewareId backend

-- | Run the Dummy server at the provided host and port.
runDummyMiddlewareServer
  :: (MonadIO m, MonadThrow m)
  => Config -> Middleware -> DummyBackend (ExceptT ServerError IO) -> m ()
runDummyMiddlewareServer Config{..} middleware backend = do
  url <- parseBaseUrl configUrl
  let warpSettings = Warp.defaultSettings
        & Warp.setPort (baseUrlPort url)
        & Warp.setHost (fromString $ baseUrlHost url)
  liftIO $ Warp.runSettings warpSettings $ middleware $ serverWaiApplicationDummy backend

-- | Plain "Network.Wai" Application for the Dummy server.
--
-- Can be used to implement e.g. tests that call the API without a full webserver.
serverWaiApplicationDummy :: DummyBackend (ExceptT ServerError IO) -> Application
serverWaiApplicationDummy backend = serveWithContextT (Proxy :: Proxy DummyAPI) context id (serverFromBackend backend)
  where
    context = serverContext
    serverFromBackend DummyBackend{..} =
      (coerce dummy :<|>
       serveDirectoryFileServer "static")


serverContext :: Context ('[])
serverContext = EmptyContext
