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
 * @param left 
 * @param right 
 */
data class Node(

    @field:Valid
    @get:JsonProperty("left") val left: Node? = null,

    @field:Valid
    @get:JsonProperty("right") val right: Node? = null
) {

}

