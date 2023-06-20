-module(petstore_example_response).

-include("petstore.hrl").

-export([petstore_example_response/0]).

-export([petstore_example_response/1]).

-export_type([petstore_example_response/0]).

-type petstore_example_response() ::
  [ {'myOnlyProperty', list(integer()) }
  ].


petstore_example_response() ->
    petstore_example_response([]).

petstore_example_response(Fields) ->
  Default = [ {'myOnlyProperty', list(integer()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

