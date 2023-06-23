package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Dummy200Response

class DefaultApi {
    String basePath = "http://localhost"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def dummy ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/example/someMethod"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    Dummy200Response.class )

    }

}
