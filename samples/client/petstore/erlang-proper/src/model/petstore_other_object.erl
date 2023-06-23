-module(petstore_other_object).

-include("petstore.hrl").

-export([petstore_other_object/0]).

-export([petstore_other_object/1]).

-export_type([petstore_other_object/0]).

-type petstore_other_object() ::
  [ {'myOnlyProperty2', petstore_example_response:petstore_example_response() }
  ].


petstore_other_object() ->
    petstore_other_object([]).

petstore_other_object(Fields) ->
  Default = [ {'myOnlyProperty2', petstore_example_response:petstore_example_response() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

