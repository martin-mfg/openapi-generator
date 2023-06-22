package org.openapitools.api;

import org.openapitools.model.ExampleResponse;
import org.openapitools.model.Node;

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
        title = "", version="dummy", description=""
   ),
   tags = @org.eclipse.microprofile.openapi.annotations.tags.Tag(name="", description="")
)
@Api(description = "the example API")
@Path("/example/someMethod")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class ExampleApi {

    @GET
    @Produces({ "*/*" })
    @ApiOperation(value = "", notes = "dummy", response = ExampleResponse.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "dummy", response = ExampleResponse.class),
        @ApiResponse(code = 201, message = "dummy", response = Node.class)
    })
    
    @org.eclipse.microprofile.openapi.annotations.Operation(operationId = "dummy", summary = "", description = "dummy")
    
    @org.eclipse.microprofile.openapi.annotations.responses.APIResponses(value = { 
            @org.eclipse.microprofile.openapi.annotations.responses.APIResponse(responseCode = "200", description = "dummy",  content = { 
                @org.eclipse.microprofile.openapi.annotations.media.Content(mediaType="*/*", schema = @org.eclipse.microprofile.openapi.annotations.media.Schema(implementation = ExampleResponse.class))
            }),
            @org.eclipse.microprofile.openapi.annotations.responses.APIResponse(responseCode = "201", description = "dummy",  content = { 
                @org.eclipse.microprofile.openapi.annotations.media.Content(mediaType="*/*", schema = @org.eclipse.microprofile.openapi.annotations.media.Schema(implementation = Node.class))
            })
        })
    public Response dummy() {
        return Response.ok().entity("magic!").build();
    }
}
