package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.Dummy200ResponseOuterPropInnerPropDto;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Dummy200ResponseOuterPropDto
 */

@JsonTypeName("dummy_200_response_outerProp")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Dummy200ResponseOuterPropDto {

  private Dummy200ResponseOuterPropInnerPropDto innerProp;

  public Dummy200ResponseOuterPropDto innerProp(Dummy200ResponseOuterPropInnerPropDto innerProp) {
    this.innerProp = innerProp;
    return this;
  }

  /**
   * Get innerProp
   * @return innerProp
  */
  
  @JsonProperty("innerProp")
  public Dummy200ResponseOuterPropInnerPropDto getInnerProp() {
    return innerProp;
  }

  public void setInnerProp(Dummy200ResponseOuterPropInnerPropDto innerProp) {
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
    Dummy200ResponseOuterPropDto dummy200ResponseOuterProp = (Dummy200ResponseOuterPropDto) o;
    return Objects.equals(this.innerProp, dummy200ResponseOuterProp.innerProp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(innerProp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dummy200ResponseOuterPropDto {\n");
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

