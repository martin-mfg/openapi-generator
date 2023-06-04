# WWW::OpenAPIClient::DefaultApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::DefaultApi;
```

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieve_something**](DefaultApi.md#retrieve_something) | **GET** /example/someMethod | 


# **retrieve_something**
> ARRAY[double] retrieve_something()



get some object

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::DefaultApi;
my $api_instance = WWW::OpenAPIClient::DefaultApi->new(
);


eval {
    my $result = $api_instance->retrieve_something();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling DefaultApi->retrieve_something: $@\n";
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ARRAY[double]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

