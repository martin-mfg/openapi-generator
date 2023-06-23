package org.openapitools.api;

import org.openapitools.model.Dummy200Response;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

@Path("/example/someMethod")
@Api(description = "the example API")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class ExampleApi {

    @GET
    @Produces({ "*/*" })
    @ApiOperation(value = "", notes = "dummy", response = Dummy200Response.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "dummy", response = Dummy200Response.class)
    })
    public Response dummy() {
        return Response.ok().entity("magic!").build();
    }
}
