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
import io.swagger.annotations.ApiModelProperty

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

    @ApiModelProperty(example = "", value = "")
    @get:JsonProperty("emptyString") val emptyString: kotlin.String? = "",

    @ApiModelProperty(example = "42", value = "")
    @get:JsonProperty("numberString") val numberString: kotlin.String? = "42",

    @ApiModelProperty(example = "false", value = "")
    @get:JsonProperty("boolString") val boolString: kotlin.String? = "false",

    @ApiModelProperty(example = "null", value = "")
    @get:JsonProperty("nullString") val nullString: kotlin.String? = "null",

    @ApiModelProperty(example = "false", value = "")
    @get:JsonProperty("aBool") val aBool: kotlin.Boolean? = false,

    @ApiModelProperty(example = "0", value = "")
    @get:JsonProperty("zero") val zero: kotlin.Int? = 0
) {

}

