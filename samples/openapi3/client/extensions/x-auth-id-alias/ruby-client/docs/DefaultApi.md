# XAuthIDAlias::DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**retrieve_something**](DefaultApi.md#retrieve_something) | **GET** /example/someMethod |  |


## retrieve_something

> Array&lt;Float&gt; retrieve_something



get some object

### Examples

```ruby
require 'time'
require 'x_auth_id_alias'

api_instance = XAuthIDAlias::DefaultApi.new

begin
  
  result = api_instance.retrieve_something
  p result
rescue XAuthIDAlias::ApiError => e
  puts "Error when calling DefaultApi->retrieve_something: #{e}"
end
```

#### Using the retrieve_something_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(Array&lt;Float&gt;, Integer, Hash)> retrieve_something_with_http_info

```ruby
begin
  
  data, status_code, headers = api_instance.retrieve_something_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => Array&lt;Float&gt;
rescue XAuthIDAlias::ApiError => e
  puts "Error when calling DefaultApi->retrieve_something_with_http_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

**Array&lt;Float&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

