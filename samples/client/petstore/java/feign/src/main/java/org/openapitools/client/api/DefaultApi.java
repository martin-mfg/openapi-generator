package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;
import org.openapitools.client.model.ApiResponse;

import org.openapitools.client.model.Dummy200Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public interface DefaultApi extends ApiClient.Api {


  /**
   * 
   * dummy
   * @return Dummy200Response
   */
  @RequestLine("GET /example/someMethod")
  @Headers({
    "Accept: */*",
  })
  Dummy200Response dummy();

  /**
   * 
   * Similar to <code>dummy</code> but it also returns the http response headers .
   * dummy
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /example/someMethod")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<Dummy200Response> dummyWithHttpInfo();


}
