package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.Dummy200ResponseOuterPropInnerProp;
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
 * Dummy200ResponseOuterProp
 */

@JsonTypeName("dummy_200_response_outerProp")
@JacksonXmlRootElement(localName = "Dummy200ResponseOuterProp")
@XmlRootElement(name = "Dummy200ResponseOuterProp")
@XmlAccessorType(XmlAccessType.FIELD)

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen")
public class Dummy200ResponseOuterProp {

  @JacksonXmlProperty(localName = "innerProp")
  private Dummy200ResponseOuterPropInnerProp innerProp;

  public Dummy200ResponseOuterProp innerProp(Dummy200ResponseOuterPropInnerProp innerProp) {
    this.innerProp = innerProp;
    return this;
  }

  /**
   * Get innerProp
   * @return innerProp
  */
  @Valid 
  @Schema(name = "innerProp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("innerProp")
  public Dummy200ResponseOuterPropInnerProp getInnerProp() {
    return innerProp;
  }

  public void setInnerProp(Dummy200ResponseOuterPropInnerProp innerProp) {
    this.innerProp = innerProp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dummy200ResponseOuterProp dummy200ResponseOuterProp = (Dummy200ResponseOuterProp) o;
    return Objects.equals(this.innerProp, dummy200ResponseOuterProp.innerProp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(innerProp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dummy200ResponseOuterProp {\n");
    sb.append("    innerProp: ").append(toIndentedString(innerProp)).append("\n");
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

