# SWGDefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exampleSomeMethodGet**](SWGDefaultApi.md#examplesomemethodget) | **GET** /example/someMethod | 


# **exampleSomeMethodGet**
```objc
-(NSURLSessionTask*) exampleSomeMethodGetWithCompletionHandler: 
        (void (^)(SWGExampleResponse* output, NSError* error)) handler;
```





### Example
```objc


SWGDefaultApi*apiInstance = [[SWGDefaultApi alloc] init];

[apiInstance exampleSomeMethodGetWithCompletionHandler: 
          ^(SWGExampleResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGDefaultApi->exampleSomeMethodGet: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SWGExampleResponse***](SWGExampleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: /

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

