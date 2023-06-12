package org.openapitools.api;

import org.openapitools.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ExampleResponse;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/example/someMethod")


@io.swagger.annotations.Api(description = "the example API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen")
public interface ExampleApi  {

    @GET
    
    
    @Produces({ "/" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "get some object", response = ExampleResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The response with results", response = ExampleResponse.class) })
    public Response retrieveSomething(@Context SecurityContext securityContext);
}
