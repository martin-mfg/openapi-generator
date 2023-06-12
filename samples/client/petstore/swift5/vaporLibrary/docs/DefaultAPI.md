# DefaultAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exampleSomeMethodGet**](DefaultAPI.md#examplesomemethodget) | **GET** /example/someMethod | 


# **exampleSomeMethodGet**
```swift
    open class func exampleSomeMethodGet(headers: HTTPHeaders = PetstoreClientAPI.customHeaders, beforeSend: (inout ClientRequest) throws -> () = { _ in }) -> EventLoopFuture<ExampleSomeMethodGet>
```





### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import PetstoreClient


DefaultAPI.exampleSomeMethodGet().whenComplete { result in
    switch result {
    case .failure(let error):
    // process error
    case .success(let response):
        switch response {
        // process decoded response value or raw ClientResponse
        case .http200(let value, let raw):
        case .http0(let value, let raw):
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

#### ExampleSomeMethodGet

```swift
public enum ExampleSomeMethodGet {
    case http200(value: ExampleResponse?, raw: ClientResponse)
    case http0(value: ExampleResponse?, raw: ClientResponse)
}
```

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: /

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

