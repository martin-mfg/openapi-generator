package org.openapitools.api

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import java.util.Optional

@jakarta.annotation.Generated(value = ["org.openapitools.codegen.languages.KotlinSpringServerCodegen"])
@Controller
@RequestMapping("\${openapi..base-path:}")
class ExampleApiController(
        @org.springframework.beans.factory.annotation.Autowired(required = false) delegate: ExampleApiDelegate?
) : ExampleApi {
    private val delegate: ExampleApiDelegate

    init {
        this.delegate = Optional.ofNullable(delegate).orElse(object : ExampleApiDelegate {})
    }

    override fun getDelegate(): ExampleApiDelegate = delegate
}
