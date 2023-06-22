-module(petstore_other_object).

-export([encode/1]).

-export_type([petstore_other_object/0]).

-type petstore_other_object() ::
    #{ 'myOnlyProperty2' => petstore_example_response:petstore_example_response()
     }.

encode(#{ 'myOnlyProperty2' := MyOnlyProperty2
        }) ->
    #{ 'myOnlyProperty2' => MyOnlyProperty2
     }.
