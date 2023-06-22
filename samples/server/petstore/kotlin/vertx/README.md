# org.openapitools - Kotlin Server library for dummy

## Requires

* Kotlin 1.3.10
* Maven 3.3

## Build

```
mvn clean package
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.

<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**dummy**](docs/DefaultApi.md#dummy) | **GET** /example/someMethod | 


<a id="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.server.api.model.ExampleResponse](docs/ExampleResponse.md)
 - [org.openapitools.server.api.model.Node](docs/Node.md)
 - [org.openapitools.server.api.model.OtherObject](docs/OtherObject.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.

