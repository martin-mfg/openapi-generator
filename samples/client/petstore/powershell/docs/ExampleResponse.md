# ExampleResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MyOnlyProperty** | **Boolean[]** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ExampleResponse = Initialize-PSPetstoreExampleResponse  -MyOnlyProperty null
```

- Convert the resource to JSON
```powershell
$ExampleResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

