package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;
import org.openapitools.client.model.ApiResponse;

import org.openapitools.client.model.ExampleResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public interface DefaultApi extends ApiClient.Api {


  /**
   * 
   * get some object
   * @return ExampleResponse
   */
  @RequestLine("GET /example/someMethod")
  @Headers({
    "Accept: /",
  })
  ExampleResponse retrieveSomething();

  /**
   * 
   * Similar to <code>retrieveSomething</code> but it also returns the http response headers .
   * get some object
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /example/someMethod")
  @Headers({
    "Accept: /",
  })
  ApiResponse<ExampleResponse> retrieveSomethingWithHttpInfo();


}
