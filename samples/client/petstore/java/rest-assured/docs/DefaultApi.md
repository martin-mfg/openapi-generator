# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**exampleSomeMethodGet**](DefaultApi.md#exampleSomeMethodGet) | **GET** /example/someMethod |  |


<a id="exampleSomeMethodGet"></a>
# **exampleSomeMethodGet**
> ExampleResponse exampleSomeMethodGet()





### Example
```java
// Import classes:
//import org.openapitools.client.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

DefaultApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost")))._default();

api.exampleSomeMethodGet().execute(r -> r.prettyPeek());
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

