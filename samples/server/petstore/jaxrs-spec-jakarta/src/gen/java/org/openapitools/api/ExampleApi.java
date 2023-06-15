package org.openapitools.api;

import org.openapitools.model.ExampleResponse;

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
    @Produces({ "/" })
    @ApiOperation(value = "", notes = "", response = ExampleResponse.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = ExampleResponse.class)
    })
    public Response exampleSomeMethodGet() {
        return Response.ok().entity("magic!").build();
    }
}
