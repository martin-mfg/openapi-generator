package org.openapitools.api;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition(
    info = @org.eclipse.microprofile.openapi.annotations.info.Info(
        version="0.0.1"
        ,title = "Some example"
        ,description = "dummy description"
        
        
))
@ApplicationPath(RestResourceRoot.APPLICATION_PATH)
public class RestApplication extends Application {

}
