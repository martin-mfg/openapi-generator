-module(petstore_example_response).

-include("petstore.hrl").

-export([petstore_example_response/0]).

-export([petstore_example_response/1]).

-export_type([petstore_example_response/0]).

-type petstore_example_response() ::
  [ {'emptyString', binary() }
  | {'numberString', binary() }
  | {'boolString', binary() }
  | {'nullString', binary() }
  | {'aBool', boolean() }
  | {'zero', integer() }
  ].


petstore_example_response() ->
    petstore_example_response([]).

petstore_example_response(Fields) ->
  Default = [ {'emptyString', binary() }
            , {'numberString', binary() }
            , {'boolString', binary() }
            , {'nullString', binary() }
            , {'aBool', boolean() }
            , {'zero', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

