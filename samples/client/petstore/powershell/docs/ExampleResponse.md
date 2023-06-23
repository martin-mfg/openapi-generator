# ExampleResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EmptyString** | **String** |  | [optional] [default to ""]
**NumberString** | **String** |  | [optional] [default to "42"]
**BoolString** | **String** |  | [optional] [default to "false"]
**NullString** | **String** |  | [optional] [default to "null"]
**ABool** | **Boolean** |  | [optional] [default to $false]
**Zero** | **Int32** |  | [optional] [default to 0]

## Examples

- Prepare the resource
```powershell
$ExampleResponse = Initialize-PSPetstoreExampleResponse  -EmptyString  `
 -NumberString 42 `
 -BoolString false `
 -NullString null `
 -ABool false `
 -Zero 0
```

- Convert the resource to JSON
```powershell
$ExampleResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

