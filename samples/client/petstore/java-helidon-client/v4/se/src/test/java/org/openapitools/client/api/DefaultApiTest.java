/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.model.FooGetDefaultResponse;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.helidon.webclient.api.HttpClientResponse;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * 
 * OpenAPI Petstore Test
 *
 * 
 * API tests for DefaultApi
 */
public class DefaultApiTest {

    private static ApiClient apiClient;
    private static DefaultApi api;
    private static final String baseUrl = "http://localhost:8080";

    @BeforeAll
    public static void setup() {
        apiClient = ApiClient.builder().build();
        api = DefaultApiImpl.create(apiClient);
    }

   /**
    * 
    */
    @Test
    public void fooGetTest() {

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<FooGetDefaultResponse> response = api.fooGet();
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

}
