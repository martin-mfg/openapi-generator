package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.DefaultApiService;
import org.openapitools.api.factories.DefaultApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Dummy200Response;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.multipart.FormDataParam;
import com.sun.jersey.multipart.FormDataBodyPart;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/example/someMethod")


@io.swagger.annotations.Api(description = "the Default API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen")
public class DefaultApi  {
   private final DefaultApiService delegate = DefaultApiServiceFactory.getDefaultApi();

    @GET
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "dummy", response = Dummy200Response.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "dummy", response = Dummy200Response.class) })
    public Response dummy(
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.dummy(securityContext);
    }
}
