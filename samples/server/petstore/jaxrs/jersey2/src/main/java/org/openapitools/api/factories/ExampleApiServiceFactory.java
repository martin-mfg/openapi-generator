package org.openapitools.api.factories;

import org.openapitools.api.ExampleApiService;
import org.openapitools.api.impl.ExampleApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen")
public class ExampleApiServiceFactory {
    private static final ExampleApiService service = new ExampleApiServiceImpl();

    public static ExampleApiService getExampleApi() {
        return service;
    }
}
