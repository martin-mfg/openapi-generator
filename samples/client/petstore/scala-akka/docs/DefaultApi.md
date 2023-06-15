# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exampleSomeMethodGet**](DefaultApi.md#exampleSomeMethodGet) | **GET** /example/someMethod | 
[**exampleSomeMethodGetWithHttpInfo**](DefaultApi.md#exampleSomeMethodGetWithHttpInfo) | **GET** /example/someMethod | 



## exampleSomeMethodGet

> exampleSomeMethodGet(): ApiRequest[ExampleResponse]





### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher

    val apiInvoker = ApiInvoker()
    val apiInstance = DefaultApi("http://localhost")    
    val request = apiInstance.exampleSomeMethodGet()
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling DefaultApi#exampleSomeMethodGet")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling DefaultApi#exampleSomeMethodGet")
            exception.printStackTrace();
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiRequest[[**ExampleResponse**](ExampleResponse.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: /

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

