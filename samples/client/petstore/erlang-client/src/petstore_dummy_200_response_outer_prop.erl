-module(petstore_dummy_200_response_outer_prop).

-export([encode/1]).

-export_type([petstore_dummy_200_response_outer_prop/0]).

-type petstore_dummy_200_response_outer_prop() ::
    #{ 'innerProp' => petstore_dummy_200_response_outer_prop_inner_prop:petstore_dummy_200_response_outer_prop_inner_prop()
     }.

encode(#{ 'innerProp' := InnerProp
        }) ->
    #{ 'innerProp' => InnerProp
     }.
