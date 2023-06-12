# XAuthIDAlias::DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**example_some_method_get**](DefaultApi.md#example_some_method_get) | **GET** /example/someMethod |  |


## example_some_method_get

> <ExampleResponse> example_some_method_get





### Examples

```ruby
require 'time'
require 'x_auth_id_alias'

api_instance = XAuthIDAlias::DefaultApi.new

begin
  
  result = api_instance.example_some_method_get
  p result
rescue XAuthIDAlias::ApiError => e
  puts "Error when calling DefaultApi->example_some_method_get: #{e}"
end
```

#### Using the example_some_method_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ExampleResponse>, Integer, Hash)> example_some_method_get_with_http_info

```ruby
begin
  
  data, status_code, headers = api_instance.example_some_method_get_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ExampleResponse>
rescue XAuthIDAlias::ApiError => e
  puts "Error when calling DefaultApi->example_some_method_get_with_http_info: #{e}"
end
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

