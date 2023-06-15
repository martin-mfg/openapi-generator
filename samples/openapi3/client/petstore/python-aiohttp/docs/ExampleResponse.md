# ExampleResponse

dummy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**empty_string** | **str** |  | [optional] [default to '']
**number_string** | **str** |  | [optional] [default to '42']
**bool_string** | **str** |  | [optional] [default to 'false']
**null_string** | **str** |  | [optional] [default to 'null']
**a_bool** | **bool** |  | [optional] [default to False]
**zero** | **int** |  | [optional] [default to 0]

## Example

```python
from petstore_api.models.example_response import ExampleResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ExampleResponse from a JSON string
example_response_instance = ExampleResponse.from_json(json)
# print the JSON string representation of the object
print ExampleResponse.to_json()

# convert the object into a dict
example_response_dict = example_response_instance.to_dict()
# create an instance of ExampleResponse from a dict
example_response_form_dict = example_response.from_dict(example_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


