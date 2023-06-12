package org.openapitools.api;

import org.openapitools.model.ExampleResponse;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * 
 *
 * <p>dummy description
 *
 */
@Path("/example/someMethod")
@Api(value = "/", description = "")
public interface DefaultApi  {

    @GET
    
    @Produces({ "/" })
    @ApiOperation(value = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The response with results", response = ExampleResponse.class) })
    public ExampleResponse retrieveSomething();
}
