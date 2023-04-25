package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Param1DefDto
 */

@JsonTypeName("Param1Def")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Param1DefDto {

  
  private List<Integer> myField;

  public Param1DefDto myField(List<Integer> myField) {
    this.myField = myField;
    return this;
  }

  public Param1DefDto addMyFieldItem(Integer myFieldItem) {
    if (this.myField == null) {
      this.myField = new ArrayList<>();
    }
    this.myField.add(myFieldItem);
    return this;
  }

  /**
   * Get myField
   * @return myField
  */
  
  @JsonProperty("myField")
  public List<Integer> getMyField() {
    return myField;
  }

  public void setMyField(List<Integer> myField) {
    this.myField = myField;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Param1DefDto param1Def = (Param1DefDto) o;
    return Objects.equals(this.myField, param1Def.myField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Param1DefDto {\n");
    sb.append("    myField: ").append(toIndentedString(myField)).append("\n");
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

