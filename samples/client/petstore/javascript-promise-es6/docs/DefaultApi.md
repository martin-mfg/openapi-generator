# Dummy.DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dummy**](DefaultApi.md#dummy) | **GET** /example/someMethod | 



## dummy

> ExampleResponse dummy()



dummy

### Example

```javascript
import Dummy from 'dummy';

let apiInstance = new Dummy.DefaultApi();
apiInstance.dummy().then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ExampleResponse**](ExampleResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

