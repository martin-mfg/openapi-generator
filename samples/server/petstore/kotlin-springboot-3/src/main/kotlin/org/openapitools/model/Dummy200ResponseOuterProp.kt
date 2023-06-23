package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Dummy200ResponseOuterPropInnerProp
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
 * 
 * @param innerProp 
 */
data class Dummy200ResponseOuterProp(

    @field:Valid
    @get:JsonProperty("innerProp") val innerProp: Dummy200ResponseOuterPropInnerProp? = null
) {

}

