package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.Dummy200Response;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen")
public class ExampleApiServiceImpl implements ExampleApi {
      public Response dummy(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
