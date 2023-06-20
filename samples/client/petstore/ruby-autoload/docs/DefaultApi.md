# Petstore::DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**dummy**](DefaultApi.md#dummy) | **GET** /example/someMethod |  |


## dummy

> <ExampleResponse> dummy



dummy

### Examples

```ruby
require 'time'
require 'petstore'

api_instance = Petstore::DefaultApi.new

begin
  
  result = api_instance.dummy
  p result
rescue Petstore::ApiError => e
  puts "Error when calling DefaultApi->dummy: #{e}"
end
```

#### Using the dummy_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ExampleResponse>, Integer, Hash)> dummy_with_http_info

```ruby
begin
  
  data, status_code, headers = api_instance.dummy_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ExampleResponse>
rescue Petstore::ApiError => e
  puts "Error when calling DefaultApi->dummy_with_http_info: #{e}"
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
- **Accept**: */*

