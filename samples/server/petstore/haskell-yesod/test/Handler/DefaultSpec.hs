{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.DefaultSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getExampleSomeMethodR" $
        it "returns 501 Not Implemented" $ do
            get ExampleSomeMethodR
            statusIs 501
