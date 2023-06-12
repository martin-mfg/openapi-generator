package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface DefaultApi {

    void retrieveSomething(Handler<AsyncResult<Integer>> handler);

    void retrieveSomething(ApiClient.AuthInfo authInfo, Handler<AsyncResult<Integer>> handler);

}
