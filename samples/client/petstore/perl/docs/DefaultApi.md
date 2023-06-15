# WWW::OpenAPIClient::DefaultApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::DefaultApi;
```

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**example_some_method_get**](DefaultApi.md#example_some_method_get) | **GET** /example/someMethod | 


# **example_some_method_get**
> ExampleResponse example_some_method_get()





### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::DefaultApi;
my $api_instance = WWW::OpenAPIClient::DefaultApi->new(
);


eval {
    my $result = $api_instance->example_some_method_get();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling DefaultApi->example_some_method_get: $@\n";
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

