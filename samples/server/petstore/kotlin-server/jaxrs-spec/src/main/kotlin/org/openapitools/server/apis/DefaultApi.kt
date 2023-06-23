package org.openapitools.server.apis;

import org.openapitools.server.models.Dummy200Response
import org.openapitools.server.models.ExampleResponse

import javax.ws.rs.*
import javax.ws.rs.core.Response


import java.io.InputStream



@Path("/")
@javax.annotation.Generated(value = arrayOf("org.openapitools.codegen.languages.KotlinServerCodegen"))
class DefaultApi {

    @GET
    @Produces("*/*")
    suspend fun dummy(): Response {
        return Response.ok().entity("magic!").build();
    }
}
