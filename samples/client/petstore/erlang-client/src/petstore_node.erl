-module(petstore_node).

-export([encode/1]).

-export_type([petstore_node/0]).

-type petstore_node() ::
    #{ 'left' => petstore_node:petstore_node(),
       'right' => petstore_node:petstore_node()
     }.

encode(#{ 'left' := Left,
          'right' := Right
        }) ->
    #{ 'left' => Left,
       'right' => Right
     }.
