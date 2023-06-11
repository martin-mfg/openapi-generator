# SomeExample.DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveSomething**](DefaultApi.md#retrieveSomething) | **GET** /example/someMethod | 



## retrieveSomething

> ExampleResponse retrieveSomething()



get some object

### Example

```javascript
import SomeExample from 'some_example';

let apiInstance = new SomeExample.DefaultApi();
apiInstance.retrieveSomething().then((data) => {
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
- **Accept**: application/json

