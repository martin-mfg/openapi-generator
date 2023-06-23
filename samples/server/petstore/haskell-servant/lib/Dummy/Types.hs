{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE DeriveDataTypeable         #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module Dummy.Types (
  Dummy200Response (..),
  Dummy200ResponseOuterProp (..),
  Dummy200ResponseOuterPropInnerProp (..),
  ExampleResponse (..),
  Node (..),
  OtherObject (..),
  ) where

import Data.Data (Data)
import Data.UUID (UUID)
import Data.List (stripPrefix)
import Data.Maybe (fromMaybe)
import Data.Aeson (Value, FromJSON(..), ToJSON(..), genericToJSON, genericParseJSON)
import Data.Aeson.Types (Options(..), defaultOptions)
import Data.Set (Set)
import Data.Text (Text)
import Data.Time
import Data.Swagger (ToSchema, declareNamedSchema)
import qualified Data.Swagger as Swagger
import qualified Data.Char as Char
import qualified Data.Text as T
import qualified Data.Map as Map
import GHC.Generics (Generic)
import Data.Function ((&))


-- | 
data Dummy200Response = Dummy200Response
  { dummy200ResponseOuterProp :: Maybe Dummy200ResponseOuterProp -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Dummy200Response where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "dummy200Response")
instance ToJSON Dummy200Response where
  toJSON = genericToJSON (removeFieldLabelPrefix False "dummy200Response")
instance ToSchema Dummy200Response where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ removeFieldLabelPrefix False "dummy200Response"


-- | 
data Dummy200ResponseOuterProp = Dummy200ResponseOuterProp
  { dummy200ResponseOuterPropInnerProp :: Maybe Dummy200ResponseOuterPropInnerProp -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Dummy200ResponseOuterProp where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "dummy200ResponseOuterProp")
instance ToJSON Dummy200ResponseOuterProp where
  toJSON = genericToJSON (removeFieldLabelPrefix False "dummy200ResponseOuterProp")
instance ToSchema Dummy200ResponseOuterProp where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ removeFieldLabelPrefix False "dummy200ResponseOuterProp"


-- | 
data Dummy200ResponseOuterPropInnerProp = Dummy200ResponseOuterPropInnerProp
  { dummy200ResponseOuterPropInnerPropMyBool :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Dummy200ResponseOuterPropInnerProp where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "dummy200ResponseOuterPropInnerProp")
instance ToJSON Dummy200ResponseOuterPropInnerProp where
  toJSON = genericToJSON (removeFieldLabelPrefix False "dummy200ResponseOuterPropInnerProp")
instance ToSchema Dummy200ResponseOuterPropInnerProp where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ removeFieldLabelPrefix False "dummy200ResponseOuterPropInnerProp"


-- | dummy
data ExampleResponse = ExampleResponse
  { exampleResponseMyOnlyProperty :: Maybe OtherObject -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ExampleResponse where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "exampleResponse")
instance ToJSON ExampleResponse where
  toJSON = genericToJSON (removeFieldLabelPrefix False "exampleResponse")
instance ToSchema ExampleResponse where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ removeFieldLabelPrefix False "exampleResponse"


-- | dummy
data Node = Node
  { nodeLeft :: Maybe Node -- ^ 
  , nodeRight :: Maybe Node -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Node where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "node")
instance ToJSON Node where
  toJSON = genericToJSON (removeFieldLabelPrefix False "node")
instance ToSchema Node where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ removeFieldLabelPrefix False "node"


-- | dummy
data OtherObject = OtherObject
  { otherObjectMyOnlyProperty2 :: Maybe ExampleResponse -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON OtherObject where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "otherObject")
instance ToJSON OtherObject where
  toJSON = genericToJSON (removeFieldLabelPrefix False "otherObject")
instance ToSchema OtherObject where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ removeFieldLabelPrefix False "otherObject"


uncapitalize :: String -> String
uncapitalize (first:rest) = Char.toLower first : rest
uncapitalize [] = []

-- | Remove a field label prefix during JSON parsing.
--   Also perform any replacements for special characters.
--   The @forParsing@ parameter is to distinguish between the cases in which we're using this
--   to power a @FromJSON@ or a @ToJSON@ instance. In the first case we're parsing, and we want
--   to replace special characters with their quoted equivalents (because we cannot have special
--   chars in identifier names), while we want to do vice versa when sending data instead.
removeFieldLabelPrefix :: Bool -> String -> Options
removeFieldLabelPrefix forParsing prefix =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = uncapitalize . fromMaybe (error ("did not find prefix " ++ prefix)) . stripPrefix prefix . replaceSpecialChars
    }
  where
    replaceSpecialChars field = foldl (&) field (map mkCharReplacement specialChars)
    specialChars =
      [ ("$", "'Dollar")
      , ("^", "'Caret")
      , ("|", "'Pipe")
      , ("=", "'Equal")
      , ("*", "'Star")
      , ("-", "'Dash")
      , ("&", "'Ampersand")
      , ("%", "'Percent")
      , ("#", "'Hash")
      , ("@", "'At")
      , ("!", "'Exclamation")
      , ("+", "'Plus")
      , (":", "'Colon")
      , (";", "'Semicolon")
      , (">", "'GreaterThan")
      , ("<", "'LessThan")
      , (".", "'Period")
      , ("_", "'Underscore")
      , ("?", "'Question_Mark")
      , (",", "'Comma")
      , ("'", "'Quote")
      , ("/", "'Slash")
      , ("(", "'Left_Parenthesis")
      , (")", "'Right_Parenthesis")
      , ("{", "'Left_Curly_Bracket")
      , ("}", "'Right_Curly_Bracket")
      , ("[", "'Left_Square_Bracket")
      , ("]", "'Right_Square_Bracket")
      , ("~", "'Tilde")
      , ("`", "'Backtick")
      , ("<=", "'Less_Than_Or_Equal_To")
      , (">=", "'Greater_Than_Or_Equal_To")
      , ("!=", "'Not_Equal")
      , ("<>", "'Not_Equal")
      , ("~=", "'Tilde_Equal")
      , ("\\", "'Back_Slash")
      , ("\"", "'Double_Quote")
      ]
    mkCharReplacement (replaceStr, searchStr) = T.unpack . replacer (T.pack searchStr) (T.pack replaceStr) . T.pack
    replacer =
      if forParsing
        then flip T.replace
        else T.replace
