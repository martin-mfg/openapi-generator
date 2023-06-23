-module(petstore_dummy_200_response_outer_prop_inner_prop).

-export([encode/1]).

-export_type([petstore_dummy_200_response_outer_prop_inner_prop/0]).

-type petstore_dummy_200_response_outer_prop_inner_prop() ::
    #{ 'myBool' => boolean()
     }.

encode(#{ 'myBool' := MyBool
        }) ->
    #{ 'myBool' => MyBool
     }.
