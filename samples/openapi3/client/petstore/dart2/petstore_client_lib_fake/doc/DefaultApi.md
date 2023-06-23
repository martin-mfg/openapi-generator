# openapi.api.DefaultApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dummy**](DefaultApi.md#dummy) | **GET** /example/someMethod | 


# **dummy**
> Dummy200Response dummy()



dummy

### Example
```dart
import 'package:openapi/api.dart';

final api_instance = DefaultApi();

try {
    final result = api_instance.dummy();
    print(result);
} catch (e) {
    print('Exception when calling DefaultApi->dummy: $e\n');
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
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

