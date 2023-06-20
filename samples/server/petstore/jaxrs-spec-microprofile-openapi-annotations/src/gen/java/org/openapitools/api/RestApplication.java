package org.openapitools.api;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition(
    info = @org.eclipse.microprofile.openapi.annotations.info.Info(
        version="dumy"
        ,title = "dummy"
        ,description = "dummy"
        
        
))
@ApplicationPath(RestResourceRoot.APPLICATION_PATH)
public class RestApplication extends Application {

}
