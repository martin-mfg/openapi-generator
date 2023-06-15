# openapi.api.DefaultApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exampleSomeMethodGet**](DefaultApi.md#examplesomemethodget) | **GET** /example/someMethod | 


# **exampleSomeMethodGet**
> ExampleResponse exampleSomeMethodGet()





### Example
```dart
import 'package:openapi/api.dart';

final api_instance = DefaultApi();

try {
    final result = api_instance.exampleSomeMethodGet();
    print(result);
} catch (e) {
    print('Exception when calling DefaultApi->exampleSomeMethodGet: $e\n');
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

