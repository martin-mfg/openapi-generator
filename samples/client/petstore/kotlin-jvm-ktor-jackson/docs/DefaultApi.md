# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveSomething**](DefaultApi.md#retrieveSomething) | **GET** /example/someMethod | 


<a id="retrieveSomething"></a>
# **retrieveSomething**
> ExampleResponse retrieveSomething()



get some object

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
try {
    val result : ExampleResponse = apiInstance.retrieveSomething()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#retrieveSomething")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#retrieveSomething")
    e.printStackTrace()
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

