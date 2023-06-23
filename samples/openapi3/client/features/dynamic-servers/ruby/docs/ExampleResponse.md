# DynamicServers::ExampleResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **empty_string** | **String** |  | [optional][default to &#39;&#39;] |
| **number_string** | **String** |  | [optional][default to &#39;42&#39;] |
| **bool_string** | **String** |  | [optional][default to &#39;false&#39;] |
| **null_string** | **String** |  | [optional][default to &#39;null&#39;] |
| **a_bool** | **Boolean** |  | [optional][default to false] |
| **zero** | **Integer** |  | [optional][default to 0] |

## Example

```ruby
require 'dynamic_servers'

instance = DynamicServers::ExampleResponse.new(
  empty_string: ,
  number_string: 42,
  bool_string: false,
  null_string: null,
  a_bool: false,
  zero: 0
)
```

