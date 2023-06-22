# Node
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Left** | [**Node**](Node.md) |  | [optional] 
**Right** | [**Node**](Node.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$Node = Initialize-PSPetstoreNode  -Left null `
 -Right null
```

- Convert the resource to JSON
```powershell
$Node | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

