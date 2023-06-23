-module(petstore_dummy_200_response_outer_prop_inner_prop).

-include("petstore.hrl").

-export([petstore_dummy_200_response_outer_prop_inner_prop/0]).

-export([petstore_dummy_200_response_outer_prop_inner_prop/1]).

-export_type([petstore_dummy_200_response_outer_prop_inner_prop/0]).

-type petstore_dummy_200_response_outer_prop_inner_prop() ::
  [ {'myBool', boolean() }
  ].


petstore_dummy_200_response_outer_prop_inner_prop() ->
    petstore_dummy_200_response_outer_prop_inner_prop([]).

petstore_dummy_200_response_outer_prop_inner_prop(Fields) ->
  Default = [ {'myBool', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

