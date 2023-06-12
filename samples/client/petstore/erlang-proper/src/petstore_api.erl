-module(petstore_api).

-export([ example_some_method_get/0
        ]).

-define(BASE_URL, "").

%% @doc 
-spec example_some_method_get() ->
  petstore_utils:response().
example_some_method_get() ->
  Method      = get,
  Host        = application:get_env(petstore, host, "http://localhost:8080"),
  Path        = ["/example/someMethod"],

  petstore_utils:request(Method, [Host, ?BASE_URL, Path]).

