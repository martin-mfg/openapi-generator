package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Dummy200ResponseOuterProp
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
 * 
 * @param outerProp 
 */
data class Dummy200Response(

    @field:Valid
    @ApiModelProperty(example = "null", value = "")
    @get:JsonProperty("outerProp") val outerProp: Dummy200ResponseOuterProp? = null
) {

}

