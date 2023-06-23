package controllers;

import apimodels.Dummy200Response;
import apimodels.ExampleResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen")
public class DefaultApiControllerImp extends DefaultApiControllerImpInterface {
    @Override
    public CompletionStage<Dummy200Response> dummy(Http.Request request) throws Exception {
        //Do your magic!!!
        return CompletableFuture.supplyAsync(() -> {
           return new Dummy200Response();
        });
    }

}
