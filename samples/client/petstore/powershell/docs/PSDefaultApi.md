# PSPetstore.PSPetstore/Api.PSDefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-PSDummy**](PSDefaultApi.md#Invoke-PSDummy) | **GET** /example/someMethod | 


<a id="Invoke-PSDummy"></a>
# **Invoke-PSDummy**
> ExampleResponse Invoke-PSDummy<br>



dummy

### Example
```powershell

try {
    $Result = Invoke-PSDummy
} catch {
    Write-Host ("Exception occurred when calling Invoke-PSDummy: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ExampleResponse**](ExampleResponse.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

