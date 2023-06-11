package org.openapitools.api;

import org.openapitools.model.ExampleResponse;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import io.swagger.annotations.*;


import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition(
   info = @org.eclipse.microprofile.openapi.annotations.info.Info(
        title = "", version="0.0.1", description=""
   ),
   tags = @org.eclipse.microprofile.openapi.annotations.tags.Tag(name="", description="")
)
@Api(description = "the example API")
@Path("/example/someMethod")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class ExampleApi {

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "get some object", response = ExampleResponse.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The response with results", response = ExampleResponse.class)
    })
    
    @org.eclipse.microprofile.openapi.annotations.Operation(operationId = "retrieveSomething", summary = "", description = "get some object")
    
    @org.eclipse.microprofile.openapi.annotations.responses.APIResponses(value = { 
            @org.eclipse.microprofile.openapi.annotations.responses.APIResponse(responseCode = "200", description = "The response with results",  content = { 
                @org.eclipse.microprofile.openapi.annotations.media.Content(mediaType="application/json", schema = @org.eclipse.microprofile.openapi.annotations.media.Schema(implementation = ExampleResponse.class))
            })
        })
    public Response retrieveSomething() {
        return Response.ok().entity("magic!").build();
    }
}
