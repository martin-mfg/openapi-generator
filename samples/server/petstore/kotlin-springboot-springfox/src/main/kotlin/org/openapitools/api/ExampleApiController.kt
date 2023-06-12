package org.openapitools.api

import org.openapitools.model.ExampleResponse
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiParam
import io.swagger.annotations.ApiResponse
import io.swagger.annotations.ApiResponses
import io.swagger.annotations.Authorization
import io.swagger.annotations.AuthorizationScope
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

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@Api(value = "example", description = "The example API")
@RequestMapping("\${api.base-path:}")
class ExampleApiController(@Autowired(required = true) val service: ExampleApiService) {


    @ApiOperation(
        value = "",
        nickname = "retrieveSomething",
        notes = "get some object",
        response = ExampleResponse::class)
    @ApiResponses(
        value = [ApiResponse(code = 200, message = "The response with results", response = ExampleResponse::class)])
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/example/someMethod"],
        produces = ["/"]
    )
    fun retrieveSomething(): ResponseEntity<ExampleResponse> {
        return ResponseEntity(service.retrieveSomething(), HttpStatus.valueOf(200))
    }
}
