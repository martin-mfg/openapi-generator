# UserApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createUsersWithArrayInput**](UserApi.md#createUsersWithArrayInput) | **POST** /user/createWithArray | Creates list of users with given input array |
| [**createUsersWithArrayInputWithHttpInfo**](UserApi.md#createUsersWithArrayInputWithHttpInfo) | **POST** /user/createWithArray | Creates list of users with given input array |



## createUsersWithArrayInput

> List<Param1Def> createUsersWithArrayInput(param0, param1)

Creates list of users with given input array



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApi apiInstance = new UserApi(defaultClient);
        Param0Def param0 = new HashMap(); // Param0Def | 
        List<Param1Def> param1 = Arrays.asList(); // List<Param1Def> | 
        try {
            List<Param1Def> result = apiInstance.createUsersWithArrayInput(param0, param1);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#createUsersWithArrayInput");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **param0** | [**Param0Def**](.md)|  | [optional] |
| **param1** | [**List&lt;Param1Def&gt;**](Param1Def.md)|  | [optional] |

### Return type

[**List&lt;Param1Def&gt;**](Param1Def.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | bar baz |  -  |
| **201** | foo bar |  -  |

## createUsersWithArrayInputWithHttpInfo

> ApiResponse<List<Param1Def>> createUsersWithArrayInput createUsersWithArrayInputWithHttpInfo(param0, param1)

Creates list of users with given input array



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApi apiInstance = new UserApi(defaultClient);
        Param0Def param0 = new HashMap(); // Param0Def | 
        List<Param1Def> param1 = Arrays.asList(); // List<Param1Def> | 
        try {
            ApiResponse<List<Param1Def>> response = apiInstance.createUsersWithArrayInputWithHttpInfo(param0, param1);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#createUsersWithArrayInput");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **param0** | [**Param0Def**](.md)|  | [optional] |
| **param1** | [**List&lt;Param1Def&gt;**](Param1Def.md)|  | [optional] |

### Return type

ApiResponse<[**List&lt;Param1Def&gt;**](Param1Def.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | bar baz |  -  |
| **201** | foo bar |  -  |

