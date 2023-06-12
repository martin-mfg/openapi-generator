package org.openapitools.api;

import org.openapitools.model.ExampleResponse;
import org.openapitools.api.ExampleApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.PATCH;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/example/someMethod")
@RequestScoped

@Api(description = "the example API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen")

public class ExampleApi  {

  @Context SecurityContext securityContext;

  @Inject ExampleApiService delegate;


    @GET
    
    
    @Produces({ "/" })
    @ApiOperation(value = "", notes = "get some object", response = ExampleResponse.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The response with results", response = ExampleResponse.class) })
    public Response retrieveSomething() {
        return delegate.retrieveSomething(securityContext);
    }
}
