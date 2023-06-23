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
 * @param left 
 * @param right 
 */
data class Node(

    @field:Valid
    @ApiModelProperty(example = "null", value = "")
    @get:JsonProperty("left") val left: Node? = null,

    @field:Valid
    @ApiModelProperty(example = "null", value = "")
    @get:JsonProperty("right") val right: Node? = null
) {

}

