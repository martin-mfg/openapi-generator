# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dummy**](DefaultApi.md#dummy) | **GET** /example/someMethod | 


<a id="dummy"></a>
# **dummy**
> Dummy200Response dummy()



dummy

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
try {
    val result : Dummy200Response = apiInstance.dummy()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#dummy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#dummy")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Dummy200Response**](Dummy200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

