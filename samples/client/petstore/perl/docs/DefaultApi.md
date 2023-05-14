# WWW::OpenAPIClient::DefaultApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::DefaultApi;
```

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**foo_get**](DefaultApi.md#foo_get) | **GET** /foo | 


# **foo_get**
> Baz foo_get()



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::DefaultApi;
my $api_instance = WWW::OpenAPIClient::DefaultApi->new(
);


eval {
    my $result = $api_instance->foo_get();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling DefaultApi->foo_get: $@\n";
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Baz**](Baz.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

