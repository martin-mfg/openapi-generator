# Petstore::DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**retrieve_something**](DefaultApi.md#retrieve_something) | **GET** /example/someMethod |  |


## retrieve_something

> <ExampleResponse> retrieve_something



get some object

### Examples

```ruby
require 'time'
require 'petstore'

api_instance = Petstore::DefaultApi.new

begin
  
  result = api_instance.retrieve_something
  p result
rescue Petstore::ApiError => e
  puts "Error when calling DefaultApi->retrieve_something: #{e}"
end
```

#### Using the retrieve_something_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ExampleResponse>, Integer, Hash)> retrieve_something_with_http_info

```ruby
begin
  
  data, status_code, headers = api_instance.retrieve_something_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ExampleResponse>
rescue Petstore::ApiError => e
  puts "Error when calling DefaultApi->retrieve_something_with_http_info: #{e}"
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
- **Accept**: application/json

