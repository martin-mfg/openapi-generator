package controllers;

import java.math.BigDecimal;

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


@SuppressWarnings("RedundantThrows")
public abstract class DefaultApiControllerImpInterface {
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result retrieveSomethingHttp(Http.Request request) throws Exception {
        List<BigDecimal> obj = retrieveSomething(request);
        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<BigDecimal> retrieveSomething(Http.Request request) throws Exception;

}
