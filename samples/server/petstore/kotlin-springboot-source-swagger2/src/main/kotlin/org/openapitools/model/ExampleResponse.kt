package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * dummy
 * @param emptyString 
 * @param numberString 
 * @param boolString 
 * @param nullString 
 * @param aBool 
 * @param zero 
 */
data class ExampleResponse(

    @Schema(example = "", description = "")
    @get:JsonProperty("emptyString") val emptyString: kotlin.String? = "",

    @Schema(example = "42", description = "")
    @get:JsonProperty("numberString") val numberString: kotlin.String? = "42",

    @Schema(example = "false", description = "")
    @get:JsonProperty("boolString") val boolString: kotlin.String? = "false",

    @Schema(example = "null", description = "")
    @get:JsonProperty("nullString") val nullString: kotlin.String? = "null",

    @Schema(example = "false", description = "")
    @get:JsonProperty("aBool") val aBool: kotlin.Boolean? = false,

    @Schema(example = "0", description = "")
    @get:JsonProperty("zero") val zero: kotlin.Int? = 0
) {

}

