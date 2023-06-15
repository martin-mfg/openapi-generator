# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**exampleSomeMethodGet**](DefaultApi.md#exampleSomeMethodGet) | **GET** /example/someMethod |  |
| [**exampleSomeMethodGetWithHttpInfo**](DefaultApi.md#exampleSomeMethodGetWithHttpInfo) | **GET** /example/someMethod |  |



## exampleSomeMethodGet

> ExampleResponse exampleSomeMethodGet()





### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            ExampleResponse result = apiInstance.exampleSomeMethodGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#exampleSomeMethodGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ExampleResponse**](ExampleResponse.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: /

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

## exampleSomeMethodGetWithHttpInfo

> ApiResponse<ExampleResponse> exampleSomeMethodGet exampleSomeMethodGetWithHttpInfo()





### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            ApiResponse<ExampleResponse> response = apiInstance.exampleSomeMethodGetWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#exampleSomeMethodGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**ExampleResponse**](ExampleResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: /

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

