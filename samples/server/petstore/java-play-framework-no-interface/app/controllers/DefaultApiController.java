package controllers;

import apimodels.ExampleResponse;
import apimodels.Node;

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
import openapitools.SecurityAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen")
public class DefaultApiController extends Controller {
    private final DefaultApiControllerImp imp;
    private final ObjectMapper mapper;
    private final Config configuration;
    private final SecurityAPIUtils securityAPIUtils;

    @Inject
    private DefaultApiController(Config configuration, DefaultApiControllerImp imp, SecurityAPIUtils securityAPIUtils) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
        this.securityAPIUtils = securityAPIUtils;
    }

    @ApiAction
    public Result dummy(Http.Request request) throws Exception {
                ExampleResponse obj = imp.dummy(request);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

}
