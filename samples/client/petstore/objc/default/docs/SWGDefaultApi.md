# SWGDefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveSomething**](SWGDefaultApi.md#retrievesomething) | **GET** /example/someMethod | 


# **retrieveSomething**
```objc
-(NSURLSessionTask*) retrieveSomethingWithCompletionHandler: 
        (void (^)(SWGExampleResponse* output, NSError* error)) handler;
```



get some object

### Example
```objc


SWGDefaultApi*apiInstance = [[SWGDefaultApi alloc] init];

[apiInstance retrieveSomethingWithCompletionHandler: 
          ^(SWGExampleResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGDefaultApi->retrieveSomething: %@", error);
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
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

