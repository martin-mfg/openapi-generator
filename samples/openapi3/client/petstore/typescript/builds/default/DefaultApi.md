# petstore.DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dummy**](DefaultApi.md#dummy) | **GET** /example/someMethod | 


# **dummy**
> ExampleResponse | Node dummy()

dummy

### Example


```typescript
import { petstore } from 'ts-petstore-client';
import * as fs from 'fs';

const configuration = petstore.createConfiguration();
const apiInstance = new petstore.DefaultApi(configuration);

let body:any = {};

apiInstance.dummy(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**ExampleResponse | Node**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | dummy |  -  |
**201** | dummy |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


