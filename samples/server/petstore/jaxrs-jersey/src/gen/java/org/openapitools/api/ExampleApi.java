package org.openapitools.api;

import org.openapitools.api.ExampleApiService;
import org.openapitools.api.factories.ExampleApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ExampleResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/example/someMethod")


@io.swagger.annotations.Api(description = "the example API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen")
public class ExampleApi  {
   private final ExampleApiService delegate;

   public ExampleApi(@Context ServletConfig servletContext) {
      ExampleApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ExampleApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ExampleApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = ExampleApiServiceFactory.getExampleApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.GET
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "dummy", response = ExampleResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "dummy", response = ExampleResponse.class)
    })
    public Response dummy(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.dummy(securityContext);
    }
}
