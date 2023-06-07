# PSPetstore.PSPetstore/Api.PSDefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-PSRetrieveSomething**](PSDefaultApi.md#Invoke-PSRetrieveSomething) | **GET** /example/someMethod | 


<a id="Invoke-PSRetrieveSomething"></a>
# **Invoke-PSRetrieveSomething**
> Decimal[] Invoke-PSRetrieveSomething<br>



get some object

### Example
```powershell

try {
    $Result = Invoke-PSRetrieveSomething
} catch {
    Write-Host ("Exception occurred when calling Invoke-PSRetrieveSomething: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Decimal[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

