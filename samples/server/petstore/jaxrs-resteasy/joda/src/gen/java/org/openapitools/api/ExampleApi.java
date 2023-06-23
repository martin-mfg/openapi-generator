package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ExampleApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Dummy200Response;
import org.openapitools.model.ExampleResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/example/someMethod")


@io.swagger.annotations.Api(description = "the example API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen")
public class ExampleApi  {

    @Inject ExampleApiService service;

    @GET
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "dummy", response = Dummy200Response.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "dummy", response = ExampleResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "dummy", response = Dummy200Response.class) })
    public Response dummy(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.dummy(securityContext);
    }
}
