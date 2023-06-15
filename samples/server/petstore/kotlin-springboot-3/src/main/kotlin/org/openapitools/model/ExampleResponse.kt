package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import jakarta.validation.Valid

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

    @get:JsonProperty("emptyString") val emptyString: kotlin.String? = "",

    @get:JsonProperty("numberString") val numberString: kotlin.String? = "42",

    @get:JsonProperty("boolString") val boolString: kotlin.String? = "false",

    @get:JsonProperty("nullString") val nullString: kotlin.String? = "null",

    @get:JsonProperty("aBool") val aBool: kotlin.Boolean? = false,

    @get:JsonProperty("zero") val zero: kotlin.Int? = 0
) {

}

