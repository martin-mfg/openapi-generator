# XAuthIDAlias::DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**dummy**](DefaultApi.md#dummy) | **GET** /example/someMethod |  |


## dummy

> <Dummy200Response> dummy



dummy

### Examples

```ruby
require 'time'
require 'x_auth_id_alias'

api_instance = XAuthIDAlias::DefaultApi.new

begin
  
  result = api_instance.dummy
  p result
rescue XAuthIDAlias::ApiError => e
  puts "Error when calling DefaultApi->dummy: #{e}"
end
```

#### Using the dummy_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Dummy200Response>, Integer, Hash)> dummy_with_http_info

```ruby
begin
  
  data, status_code, headers = api_instance.dummy_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Dummy200Response>
rescue XAuthIDAlias::ApiError => e
  puts "Error when calling DefaultApi->dummy_with_http_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Dummy200Response**](Dummy200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

