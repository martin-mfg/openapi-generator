-module(petstore_default_api).

-export([retrieve_something/1, retrieve_something/2]).

-define(BASE_URL, <<"">>).

%% @doc 
%% get some object
-spec retrieve_something(ctx:ctx()) -> {ok, integer(), petstore_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), petstore_utils:response_info()}.
retrieve_something(Ctx) ->
    retrieve_something(Ctx, #{}).

-spec retrieve_something(ctx:ctx(), maps:map()) -> {ok, integer(), petstore_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), petstore_utils:response_info()}.
retrieve_something(Ctx, Optional) ->
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


