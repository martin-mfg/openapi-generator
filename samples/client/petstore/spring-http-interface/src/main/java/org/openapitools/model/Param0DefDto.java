package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Param1DefDto;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Param0DefDto
 */

@JsonTypeName("Param0Def")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Param0DefDto {

  
  private List<Param1DefDto> param0Field;

  public Param0DefDto param0Field(List<Param1DefDto> param0Field) {
    this.param0Field = param0Field;
    return this;
  }

  public Param0DefDto addParam0FieldItem(Param1DefDto param0FieldItem) {
    if (this.param0Field == null) {
      this.param0Field = new ArrayList<>();
    }
    this.param0Field.add(param0FieldItem);
    return this;
  }

  /**
   * Get param0Field
   * @return param0Field
  */
  
  @JsonProperty("param0Field")
  public List<Param1DefDto> getParam0Field() {
    return param0Field;
  }

  public void setParam0Field(List<Param1DefDto> param0Field) {
    this.param0Field = param0Field;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Param0DefDto param0Def = (Param0DefDto) o;
    return Objects.equals(this.param0Field, param0Def.param0Field);
  }

  @Override
  public int hashCode() {
    return Objects.hash(param0Field);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Param0DefDto {\n");
    sb.append("    param0Field: ").append(toIndentedString(param0Field)).append("\n");
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

