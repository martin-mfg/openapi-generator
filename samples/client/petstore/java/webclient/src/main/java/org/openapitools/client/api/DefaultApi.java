package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ExampleResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(new ApiClient());
    }

    @Autowired
    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * get some object
     * <p><b>200</b> - The response with results
     * @return ExampleResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec retrieveSomethingRequestCreation() throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ExampleResponse> localVarReturnType = new ParameterizedTypeReference<ExampleResponse>() {};
        return apiClient.invokeAPI("/example/someMethod", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * get some object
     * <p><b>200</b> - The response with results
     * @return ExampleResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ExampleResponse> retrieveSomething() throws WebClientResponseException {
        ParameterizedTypeReference<ExampleResponse> localVarReturnType = new ParameterizedTypeReference<ExampleResponse>() {};
        return retrieveSomethingRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * 
     * get some object
     * <p><b>200</b> - The response with results
     * @return ResponseEntity&lt;ExampleResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ExampleResponse>> retrieveSomethingWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<ExampleResponse> localVarReturnType = new ParameterizedTypeReference<ExampleResponse>() {};
        return retrieveSomethingRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * 
     * get some object
     * <p><b>200</b> - The response with results
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec retrieveSomethingWithResponseSpec() throws WebClientResponseException {
        return retrieveSomethingRequestCreation();
    }
}
