<a name="__pageTop"></a>
# openapi_client.apis.tags.user_api.UserApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_users_with_array_input**](#create_users_with_array_input) | **post** /user/createWithArray | Creates list of users with given input array

# **create_users_with_array_input**
<a name="create_users_with_array_input"></a>
> [Param1Def] create_users_with_array_input()

Creates list of users with given input array

### Example

```python
import openapi_client
from openapi_client.apis.tags import user_api
from openapi_client.model.param1_def import Param1Def
from openapi_client.model.param0_def import Param0Def
from openapi_client.model.my_int_array import MyIntArray
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = user_api.UserApi(api_client)

    # example passing only optional values
    header_params = {
        'param0': Param0Def(
        param0_field=[
            Param1Def(
                my_field=MyIntArray([
                    1
                ]),
            )
        ],
    ),
        'param1': [
        Param1Def(
            my_field=MyIntArray([
                1
            ]),
        )
    ],
    }
    try:
        # Creates list of users with given input array
        api_response = api_instance.create_users_with_array_input(
            header_params=header_params,
        )
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling UserApi->create_users_with_array_input: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
header_params | RequestHeaderParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### header_params
#### RequestHeaderParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
param0 | Param0Schema | | optional
param1 | Param1Schema | | optional

# Param0Schema
Type | Description  | Notes
------------- | ------------- | -------------
[**Param0Def**](../../models/Param0Def.md) |  | 


# Param1Schema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**Param1Def**]({{complexTypePrefix}}Param1Def.md) | [**Param1Def**]({{complexTypePrefix}}Param1Def.md) | [**Param1Def**]({{complexTypePrefix}}Param1Def.md) |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#create_users_with_array_input.ApiResponseFor200) | bar baz
201 | [ApiResponseFor201](#create_users_with_array_input.ApiResponseFor201) | foo bar

#### create_users_with_array_input.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**Param1Def**]({{complexTypePrefix}}Param1Def.md) | [**Param1Def**]({{complexTypePrefix}}Param1Def.md) | [**Param1Def**]({{complexTypePrefix}}Param1Def.md) |  | 

#### create_users_with_array_input.ApiResponseFor201
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor201ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor201ResponseBodyApplicationJson

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**myField** | [**MyIntArray**]({{complexTypePrefix}}MyIntArray.md) | [**MyIntArray**]({{complexTypePrefix}}MyIntArray.md) |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

