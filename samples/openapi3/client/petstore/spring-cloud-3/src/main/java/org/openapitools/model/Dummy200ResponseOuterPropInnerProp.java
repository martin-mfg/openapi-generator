package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Dummy200ResponseOuterPropInnerProp
 */

@JsonTypeName("dummy_200_response_outerProp_innerProp")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Dummy200ResponseOuterPropInnerProp {

  private Boolean myBool;

  public Dummy200ResponseOuterPropInnerProp myBool(Boolean myBool) {
    this.myBool = myBool;
    return this;
  }

  /**
   * Get myBool
   * @return myBool
  */
  
  @Schema(name = "myBool", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("myBool")
  public Boolean getMyBool() {
    return myBool;
  }

  public void setMyBool(Boolean myBool) {
    this.myBool = myBool;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dummy200ResponseOuterPropInnerProp dummy200ResponseOuterPropInnerProp = (Dummy200ResponseOuterPropInnerProp) o;
    return Objects.equals(this.myBool, dummy200ResponseOuterPropInnerProp.myBool);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myBool);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dummy200ResponseOuterPropInnerProp {\n");
    sb.append("    myBool: ").append(toIndentedString(myBool)).append("\n");
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

