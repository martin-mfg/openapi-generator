package org.openapitools.api

import org.openapitools.model.ExampleResponse
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlinx.coroutines.flow.Flow
import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:}")
class ExampleApiController(@Autowired(required = true) val service: ExampleApiService) {

    @Operation(
        summary = "",
        operationId = "exampleSomeMethodGet",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = ExampleResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/example/someMethod"],
        produces = ["/"]
    )
    suspend fun exampleSomeMethodGet(): ResponseEntity<ExampleResponse> {
        return ResponseEntity(service.exampleSomeMethodGet(), HttpStatus.valueOf(200))
    }
}
