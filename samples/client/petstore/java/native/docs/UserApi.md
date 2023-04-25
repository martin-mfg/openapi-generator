# UserApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createUsersWithArrayInput**](UserApi.md#createUsersWithArrayInput) | **POST** /user/createWithArray | Creates list of users with given input array |
| [**createUsersWithArrayInputWithHttpInfo**](UserApi.md#createUsersWithArrayInputWithHttpInfo) | **POST** /user/createWithArray | Creates list of users with given input array |



## createUsersWithArrayInput

> ArrayType<Param1DefType> createUsersWithArrayInput(param1, param2)

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
        Param0Def param1 = new HashMap(); // Param0Def | 
        ArrayType<Param1DefType> param2 = Arrays.asList(); // ArrayType<Param1DefType> | 
        try {
            ArrayType<Param1DefType> result = apiInstance.createUsersWithArrayInput(param1, param2);
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
| **param1** | [**Param0Def**](.md)|  | [optional] |
| **param2** | [**ArrayType&lt;Param1DefType&gt;**](Param1DefType.md)|  | [optional] |

### Return type

[**ArrayType&lt;Param1DefType&gt;**](Param1DefType.md)


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

> ApiResponse<ArrayType<Param1DefType>> createUsersWithArrayInput createUsersWithArrayInputWithHttpInfo(param1, param2)

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
        Param0Def param1 = new HashMap(); // Param0Def | 
        ArrayType<Param1DefType> param2 = Arrays.asList(); // ArrayType<Param1DefType> | 
        try {
            ApiResponse<ArrayType<Param1DefType>> response = apiInstance.createUsersWithArrayInputWithHttpInfo(param1, param2);
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
| **param1** | [**Param0Def**](.md)|  | [optional] |
| **param2** | [**ArrayType&lt;Param1DefType&gt;**](Param1DefType.md)|  | [optional] |

### Return type

ApiResponse<[**ArrayType&lt;Param1DefType&gt;**](Param1DefType.md)>


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

