package controllers;

import apimodels.Pet;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen")
public class PetApiControllerImp extends PetApiControllerImpInterface {
    @Override
    public void addPet(Http.Request request, Pet body) throws Exception {
        //Do your magic!!!
    }

    @Override
    public array<java.util.List<Pet>> findPetsByStatus(Http.Request request, @NotNull java.util.List<String> status) throws Exception {
        //Do your magic!!!
        return new ArrayList<java.util.List<Pet>>();
    }

    @Override
    public void updatePet(Http.Request request, Pet body) throws Exception {
        //Do your magic!!!
    }

}
