-module(petstore_api).

-export([ retrieve_something/0
        ]).

-define(BASE_URL, "").

%% @doc 
%% get some object
-spec retrieve_something() ->
  petstore_utils:response().
retrieve_something() ->
  Method      = get,
  Host        = application:get_env(petstore, host, "http://localhost:8080"),
  Path        = ["/example/someMethod"],

  petstore_utils:request(Method, [Host, ?BASE_URL, Path]).

