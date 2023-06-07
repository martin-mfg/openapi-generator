# openapi.api.DefaultApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveSomething**](DefaultApi.md#retrievesomething) | **GET** /example/someMethod | 


# **retrieveSomething**
> List<num> retrieveSomething()



get some object

### Example
```dart
import 'package:openapi/api.dart';

final api_instance = DefaultApi();

try {
    final result = api_instance.retrieveSomething();
    print(result);
} catch (e) {
    print('Exception when calling DefaultApi->retrieveSomething: $e\n');
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List<num>**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

