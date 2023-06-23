-module(petstore_dummy_200_response).

-include("petstore.hrl").

-export([petstore_dummy_200_response/0]).

-export([petstore_dummy_200_response/1]).

-export_type([petstore_dummy_200_response/0]).

-type petstore_dummy_200_response() ::
  [ {'outerProp', petstore_dummy_200_response_outer_prop:petstore_dummy_200_response_outer_prop() }
  ].


petstore_dummy_200_response() ->
    petstore_dummy_200_response([]).

petstore_dummy_200_response(Fields) ->
  Default = [ {'outerProp', petstore_dummy_200_response_outer_prop:petstore_dummy_200_response_outer_prop() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

