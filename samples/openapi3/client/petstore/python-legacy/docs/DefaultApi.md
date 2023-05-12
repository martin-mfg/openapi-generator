# petstore_api.DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**foo_get**](DefaultApi.md#foo_get) | **GET** /foo | 


# **foo_get**
> FooGetDefaultResponse foo_get()



### Example

```python
from __future__ import print_function
import time
import petstore_api
from petstore_api.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = petstore_api.Configuration(
    host = "http://localhost"
)


# Enter a context with an instance of the API client
with petstore_api.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = petstore_api.DefaultApi(api_client)
    
    try:
        api_response = api_instance.foo_get()
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling DefaultApi->foo_get: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FooGetDefaultResponse**](FooGetDefaultResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

