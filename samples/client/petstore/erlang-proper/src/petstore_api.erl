-module(petstore_api).

-export([ dummy/0
        ]).

-define(BASE_URL, "").

%% @doc 
%% dummy
-spec dummy() ->
  petstore_utils:response().
dummy() ->
  Method      = get,
  Host        = application:get_env(petstore, host, "http://localhost:8080"),
  Path        = ["/example/someMethod"],

  petstore_utils:request(Method, [Host, ?BASE_URL, Path]).

