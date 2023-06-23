-module(petstore_default_api).

-export([dummy/1, dummy/2]).

-define(BASE_URL, <<"">>).

%% @doc 
%% dummy
-spec dummy(ctx:ctx()) -> {ok, petstore_dummy_200_response:petstore_dummy_200_response(), petstore_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), petstore_utils:response_info()}.
dummy(Ctx) ->
    dummy(Ctx, #{}).

-spec dummy(ctx:ctx(), maps:map()) -> {ok, petstore_dummy_200_response:petstore_dummy_200_response(), petstore_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), petstore_utils:response_info()}.
dummy(Ctx, Optional) ->
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


