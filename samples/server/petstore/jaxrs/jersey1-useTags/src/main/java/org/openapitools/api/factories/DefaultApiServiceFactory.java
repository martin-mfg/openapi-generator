package org.openapitools.api.factories;

import org.openapitools.api.DefaultApiService;
import org.openapitools.api.impl.DefaultApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen")
public class DefaultApiServiceFactory {
    private static final DefaultApiService service = new DefaultApiServiceImpl();

    public static DefaultApiService getDefaultApi() {
        return service;
    }
}
