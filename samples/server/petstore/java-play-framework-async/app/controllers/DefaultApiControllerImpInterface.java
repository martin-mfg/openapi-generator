package controllers;

import apimodels.ExampleResponse;
import apimodels.Node;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public abstract class DefaultApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public CompletionStage<Result> dummyHttp(Http.Request request) throws Exception {
        CompletionStage<ExampleResponse> stage = dummy(request).thenApply(obj -> { 

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        return obj;
    });
return stage.thenApply(obj -> {
            JsonNode result = mapper.valueToTree(obj);

            return ok(result);
    });

    }

    public abstract CompletionStage<ExampleResponse> dummy(Http.Request request) throws Exception;

}
