# petstore_api.DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dummy**](DefaultApi.md#dummy) | **GET** /example/someMethod | 


# **dummy**
> ExampleResponse dummy()



dummy

### Example

```python
import time
import os
import petstore_api
from petstore_api.models.example_response import ExampleResponse
from petstore_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = petstore_api.Configuration(
    host = "http://localhost"
)


# Enter a context with an instance of the API client
with petstore_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = petstore_api.DefaultApi(api_client)

    try:
        api_response = api_instance.dummy()
        print("The response of DefaultApi->dummy:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->dummy: %s\n" % e)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | dummy |  -  |
**201** | dummy |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

