package org.openapitools.api;

import org.openapitools.model.Dummy200Response;
import org.openapitools.model.ExampleResponse;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/example/someMethod")
@Api(description = "the example API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class ExampleApi {

    @GET
    @Produces({ "*/*" })
    @ApiOperation(value = "", notes = "dummy", response = Dummy200Response.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "dummy", response = ExampleResponse.class),
        @ApiResponse(code = 200, message = "dummy", response = Dummy200Response.class)
    })
    public Response dummy() {
        return Response.ok().entity("magic!").build();
    }
}
