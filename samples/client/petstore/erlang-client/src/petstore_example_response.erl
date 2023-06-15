-module(petstore_example_response).

-export([encode/1]).

-export_type([petstore_example_response/0]).

-type petstore_example_response() ::
    #{ 'myOnlyProperty' => list()
     }.

encode(#{ 'myOnlyProperty' := MyOnlyProperty
        }) ->
    #{ 'myOnlyProperty' => MyOnlyProperty
     }.
