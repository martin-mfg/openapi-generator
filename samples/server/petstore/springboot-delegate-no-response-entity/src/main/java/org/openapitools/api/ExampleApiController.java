package org.openapitools.api;

import org.openapitools.model.ExampleResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@RestController
@RequestMapping("${openapi.dummy.base-path:}")
public class ExampleApiController implements ExampleApi {

    private final ExampleApiDelegate delegate;

    public ExampleApiController(@Autowired(required = false) ExampleApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ExampleApiDelegate() {});
    }

    @Override
    public ExampleApiDelegate getDelegate() {
        return delegate;
    }

}
