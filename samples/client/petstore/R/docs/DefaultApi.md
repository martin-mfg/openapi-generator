# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ExampleSomeMethodGet**](DefaultApi.md#ExampleSomeMethodGet) | **GET** /example/someMethod | 


# **ExampleSomeMethodGet**
> ExampleResponse ExampleSomeMethodGet()





### Example
```R
library(petstore)


api_instance <- DefaultApi$new()
result <- tryCatch(
             # to save the result into a file, simply add the optional `data_file` parameter, e.g.
             # api_instance$ExampleSomeMethodGet(data_file = "result.txt"),
             api_instance$ExampleSomeMethodGet(),
             ApiException = function(ex) ex
          )
# In case of error, print the error object
if (!is.null(result$ApiException)) {
  print("Exception occurs when calling `ExampleSomeMethodGet`:")
  dput(result$ApiException$toString())
  # error object
  dput(result$ApiException$error_object$toJSONString())
} else {
  # deserialized response object
  print("The response is ...")
  dput(result$toString())
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

