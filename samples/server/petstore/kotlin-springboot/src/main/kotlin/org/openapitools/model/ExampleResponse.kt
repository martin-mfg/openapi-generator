package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.OtherObject
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * dummy
 * @param myOnlyProperty 
 */
data class ExampleResponse(

    @field:Valid
    @get:JsonProperty("myOnlyProperty") val myOnlyProperty: OtherObject? = null
) {

}

