-module(petstore_dummy_200_response_outer_prop).

-include("petstore.hrl").

-export([petstore_dummy_200_response_outer_prop/0]).

-export([petstore_dummy_200_response_outer_prop/1]).

-export_type([petstore_dummy_200_response_outer_prop/0]).

-type petstore_dummy_200_response_outer_prop() ::
  [ {'innerProp', petstore_dummy_200_response_outer_prop_inner_prop:petstore_dummy_200_response_outer_prop_inner_prop() }
  ].


petstore_dummy_200_response_outer_prop() ->
    petstore_dummy_200_response_outer_prop([]).

petstore_dummy_200_response_outer_prop(Fields) ->
  Default = [ {'innerProp', petstore_dummy_200_response_outer_prop_inner_prop:petstore_dummy_200_response_outer_prop_inner_prop() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

