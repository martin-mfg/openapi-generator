# OpenapiJsClient.DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exampleSomeMethodGet**](DefaultApi.md#exampleSomeMethodGet) | **GET** /example/someMethod | 



## exampleSomeMethodGet

> ExampleResponse exampleSomeMethodGet()





### Example

```javascript
import OpenapiJsClient from 'openapi-js-client';

let apiInstance = new OpenapiJsClient.DefaultApi();
apiInstance.exampleSomeMethodGet().then((data) => {
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
- **Accept**: /

