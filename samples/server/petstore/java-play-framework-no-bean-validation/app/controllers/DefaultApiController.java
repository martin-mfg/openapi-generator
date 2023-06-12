package controllers;

import apimodels.ExampleResponse;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;


import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen")
public class DefaultApiController extends Controller {
    private final DefaultApiControllerImpInterface imp;
    private final ObjectMapper mapper;

    @Inject
    private DefaultApiController(DefaultApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }

    @ApiAction
    public Result exampleSomeMethodGet(Http.Request request) throws Exception {
        return imp.exampleSomeMethodGetHttp(request);
    }

}
