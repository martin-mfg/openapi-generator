# SWGDefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dummy**](SWGDefaultApi.md#dummy) | **GET** /example/someMethod | 


# **dummy**
```objc
-(NSURLSessionTask*) dummyWithCompletionHandler: 
        (void (^)(SWGDummy200Response* output, NSError* error)) handler;
```



dummy

### Example
```objc


SWGDefaultApi*apiInstance = [[SWGDefaultApi alloc] init];

[apiInstance dummyWithCompletionHandler: 
          ^(SWGDummy200Response* output, NSError* error) {
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

[**SWGDummy200Response***](SWGDummy200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

