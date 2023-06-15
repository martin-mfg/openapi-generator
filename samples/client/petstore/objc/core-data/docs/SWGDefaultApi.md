# SWGDefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dummy**](SWGDefaultApi.md#dummy) | **GET** /example/someMethod | 


# **dummy**
```objc
-(NSURLSessionTask*) dummyWithCompletionHandler: 
        (void (^)(SWGExampleResponse* output, NSError* error)) handler;
```



dummy

### Example
```objc


SWGDefaultApi*apiInstance = [[SWGDefaultApi alloc] init];

[apiInstance dummyWithCompletionHandler: 
          ^(SWGExampleResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGDefaultApi->dummy: %@", error);
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
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

