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
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen")
public class DefaultApiControllerImp extends DefaultApiControllerImpInterface {
    @Override
    public Dummy200Response dummy(Http.Request request)  {
        //Do your magic!!!
        return new Dummy200Response();
    }

}
