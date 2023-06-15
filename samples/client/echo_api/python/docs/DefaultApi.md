# openapi_client.DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**example_some_method_get**](DefaultApi.md#example_some_method_get) | **GET** /example/someMethod | 


# **example_some_method_get**
> ExampleResponse example_some_method_get()





### Example

```python
import time
import os
import openapi_client
from openapi_client.models.example_response import ExampleResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)

    try:
        api_response = api_instance.example_some_method_get()
        print("The response of DefaultApi->example_some_method_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->example_some_method_get: %s\n" % e)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

