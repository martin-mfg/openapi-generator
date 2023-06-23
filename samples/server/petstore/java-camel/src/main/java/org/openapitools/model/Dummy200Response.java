package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.Dummy200ResponseOuterProp;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.xml.bind.annotation.*;

import java.util.*;
import javax.annotation.Generated;

/**
 * Dummy200Response
 */

@JsonTypeName("dummy_200_response")
@JacksonXmlRootElement(localName = "Dummy200Response")
@XmlRootElement(name = "Dummy200Response")
@XmlAccessorType(XmlAccessType.FIELD)

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen")
public class Dummy200Response {

  @JacksonXmlProperty(localName = "outerProp")
  private Dummy200ResponseOuterProp outerProp;

  public Dummy200Response outerProp(Dummy200ResponseOuterProp outerProp) {
    this.outerProp = outerProp;
    return this;
  }

  /**
   * Get outerProp
   * @return outerProp
  */
  @Valid 
  @Schema(name = "outerProp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("outerProp")
  public Dummy200ResponseOuterProp getOuterProp() {
    return outerProp;
  }

  public void setOuterProp(Dummy200ResponseOuterProp outerProp) {
    this.outerProp = outerProp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dummy200Response dummy200Response = (Dummy200Response) o;
    return Objects.equals(this.outerProp, dummy200Response.outerProp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outerProp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dummy200Response {\n");
    sb.append("    outerProp: ").append(toIndentedString(outerProp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

