# DefaultAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exampleSomeMethodGet**](DefaultAPI.md#examplesomemethodget) | **GET** /example/someMethod | 


# **exampleSomeMethodGet**
```swift
    open class func exampleSomeMethodGet() -> Promise<ExampleResponse>
```





### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import PetstoreClient


DefaultAPI.exampleSomeMethodGet().then {
         // when the promise is fulfilled
     }.always {
         // regardless of whether the promise is fulfilled, or rejected
     }.catch { errorType in
         // when the promise is rejected
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

