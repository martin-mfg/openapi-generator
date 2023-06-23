-module(petstore_node).

-include("petstore.hrl").

-export([petstore_node/0]).

-export([petstore_node/1]).

-export_type([petstore_node/0]).

-type petstore_node() ::
  [ {'left', petstore_node:petstore_node() }
  | {'right', petstore_node:petstore_node() }
  ].


petstore_node() ->
    petstore_node([]).

petstore_node(Fields) ->
  Default = [ {'left', petstore_node:petstore_node() }
            , {'right', petstore_node:petstore_node() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

