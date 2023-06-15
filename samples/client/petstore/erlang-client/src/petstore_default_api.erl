-module(petstore_default_api).

-export([example_some_method_get/1, example_some_method_get/2]).

-define(BASE_URL, <<"">>).

%% @doc 
-spec example_some_method_get(ctx:ctx()) -> {ok, petstore_example_response:petstore_example_response(), petstore_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), petstore_utils:response_info()}.
example_some_method_get(Ctx) ->
    example_some_method_get(Ctx, #{}).

-spec example_some_method_get(ctx:ctx(), maps:map()) -> {ok, petstore_example_response:petstore_example_response(), petstore_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), petstore_utils:response_info()}.
example_some_method_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(petstore_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/example/someMethod"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = petstore_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    petstore_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


