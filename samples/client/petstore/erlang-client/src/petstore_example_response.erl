-module(petstore_example_response).

-export([encode/1]).

-export_type([petstore_example_response/0]).

-type petstore_example_response() ::
    #{ 'emptyString' => binary(),
       'numberString' => binary(),
       'boolString' => binary(),
       'nullString' => binary(),
       'aBool' => boolean(),
       'zero' => integer()
     }.

encode(#{ 'emptyString' := EmptyString,
          'numberString' := NumberString,
          'boolString' := BoolString,
          'nullString' := NullString,
          'aBool' := ABool,
          'zero' := Zero
        }) ->
    #{ 'emptyString' => EmptyString,
       'numberString' => NumberString,
       'boolString' => BoolString,
       'nullString' => NullString,
       'aBool' => ABool,
       'zero' => Zero
     }.
