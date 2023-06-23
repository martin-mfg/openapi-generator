-module(petstore_dummy_200_response).

-export([encode/1]).

-export_type([petstore_dummy_200_response/0]).

-type petstore_dummy_200_response() ::
    #{ 'outerProp' => petstore_dummy_200_response_outer_prop:petstore_dummy_200_response_outer_prop()
     }.

encode(#{ 'outerProp' := OuterProp
        }) ->
    #{ 'outerProp' => OuterProp
     }.
