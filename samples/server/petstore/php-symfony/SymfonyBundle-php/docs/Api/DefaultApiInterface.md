# OpenAPI\Server\Api\DefaultApiInterface

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exampleSomeMethodGet**](DefaultApiInterface.md#exampleSomeMethodGet) | **GET** /example/someMethod | 


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\DefaultApi:
        tags:
            - { name: "open_api_server.api", api: "default" }
    # ...
```

## **exampleSomeMethodGet**
> OpenAPI\Server\Model\ExampleResponse exampleSomeMethodGet()





### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/DefaultApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\DefaultApiInterface;

class DefaultApi implements DefaultApiInterface
{

    // ...

    /**
     * Implementation of DefaultApiInterface#exampleSomeMethodGet
     */
    public function exampleSomeMethodGet(int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OpenAPI\Server\Model\ExampleResponse**](../Model/ExampleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: /

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

