package org.openapitools.client.api;

import org.openapitools.client.model.Dummy200Response;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.MultiMap;
import io.vertx.core.json.JsonObject;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.*;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DefaultApiImpl implements DefaultApi {

    private ApiClient apiClient;

    public DefaultApiImpl() {
        this(null);
    }

    public DefaultApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient != null ? apiClient : Configuration.getDefaultApiClient();
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
    * 
    * dummy
    * @param resultHandler Asynchronous result handler
    */
    public void dummy(Handler<AsyncResult<Dummy200Response>> resultHandler) {
        dummy(null, resultHandler);
    }

    /**
    * 
    * dummy
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void dummy(ApiClient.AuthInfo authInfo, Handler<AsyncResult<Dummy200Response>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/example/someMethod";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "*/*" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] {  };
        TypeReference<Dummy200Response> localVarReturnType = new TypeReference<Dummy200Response>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }

    private String encodeParameter(String parameter) {
        try {
            return URLEncoder.encode(parameter, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            return parameter;
        }
    }
}
