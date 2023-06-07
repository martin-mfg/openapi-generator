package org.openapitools.vertxweb.server.api;

import java.math.BigDecimal;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface DefaultApi  {
    Future<ApiResponse<List<BigDecimal>>> retrieveSomething();
}
