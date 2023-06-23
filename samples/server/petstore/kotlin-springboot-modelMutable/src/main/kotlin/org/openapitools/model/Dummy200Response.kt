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
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param outerProp 
 */
data class Dummy200Response(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("outerProp") var outerProp: Dummy200ResponseOuterProp? = null
) {

}

