# DefaultAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveSomething**](DefaultAPI.md#retrievesomething) | **GET** /example/someMethod | 


# **retrieveSomething**
```swift
    open class func retrieveSomething(completion: @escaping (_ data: PrefixExampleResponseSuffix?, _ error: Error?) -> Void)
```



get some object

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import PetstoreClient


DefaultAPI.retrieveSomething() { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PrefixExampleResponseSuffix**](PrefixExampleResponseSuffix.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: /

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

