# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**dummy**](DefaultApi.md#dummy) | **GET** /example/someMethod |  |


## Creating DefaultApi

To initiate an instance of `DefaultApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.DefaultApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(DefaultApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    DefaultApi defaultApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="dummy"></a>
# **dummy**
```java
Mono<ExampleResponse> DefaultApi.dummy()
```



dummy



### Return type
[**ExampleResponse**](ExampleResponse.md)



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

