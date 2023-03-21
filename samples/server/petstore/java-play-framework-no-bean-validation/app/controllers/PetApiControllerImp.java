package controllers;

import java.io.InputStream;
import apimodels.ModelApiResponse;
import apimodels.Pet;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen")
public class PetApiControllerImp extends PetApiControllerImpInterface {
    @Override
    public void addPet(Http.Request request, Pet body) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void deletePet(Http.Request request, Long petId, String apiKey) throws Exception {
        //Do your magic!!!
    }

    @Override
    public array<java.util.List<Pet>> findPetsByStatus(Http.Request request, java.util.List<String> status) throws Exception {
        //Do your magic!!!
        return new ArrayList<java.util.List<Pet>>();
    }

    @Override
    public array<java.util.List<Pet>> findPetsByTags(Http.Request request, java.util.List<String> tags) throws Exception {
        //Do your magic!!!
        return new ArrayList<java.util.List<Pet>>();
    }

    @Override
    public Pet getPetById(Http.Request request, Long petId) throws Exception {
        //Do your magic!!!
        return new Pet();
    }

    @Override
    public void updatePet(Http.Request request, Pet body) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void updatePetWithForm(Http.Request request, Long petId, String name, String status) throws Exception {
        //Do your magic!!!
    }

    @Override
    public ModelApiResponse uploadFile(Http.Request request, Long petId, String additionalMetadata, Http.MultipartFormData.FilePart<TemporaryFile> _file) throws Exception {
        //Do your magic!!!
        return new ModelApiResponse();
    }

}
