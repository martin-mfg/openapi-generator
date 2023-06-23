package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Dummy200ResponseOuterPropDto;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * Dummy200ResponseDto
 */

@JsonTypeName("dummy_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Dummy200ResponseDto {

  private Dummy200ResponseOuterPropDto outerProp;

  public Dummy200ResponseDto outerProp(Dummy200ResponseOuterPropDto outerProp) {
    this.outerProp = outerProp;
    return this;
  }

  /**
   * Get outerProp
   * @return outerProp
  */
  @Valid 
  @ApiModelProperty(value = "")
  @JsonProperty("outerProp")
  public Dummy200ResponseOuterPropDto getOuterProp() {
    return outerProp;
  }

  public void setOuterProp(Dummy200ResponseOuterPropDto outerProp) {
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
    Dummy200ResponseDto dummy200Response = (Dummy200ResponseDto) o;
    return Objects.equals(this.outerProp, dummy200Response.outerProp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outerProp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dummy200ResponseDto {\n");
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

