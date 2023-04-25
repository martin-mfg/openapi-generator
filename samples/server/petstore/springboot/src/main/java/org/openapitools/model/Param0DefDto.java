package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.xyz.ArrayType;
import java.xyz.Param1DefType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * Param0DefDto
 */

@JsonTypeName("Param0Def")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Param0DefDto {

  @Valid
  private ArrayType<@Valid Param1DefType> param0Field;

  public Param0DefDto param0Field(ArrayType<@Valid Param1DefType> param0Field) {
    this.param0Field = param0Field;
    return this;
  }

  public Param0DefDto addParam0FieldItem(Param1DefType param0FieldItem) {
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
  @Valid 
  @ApiModelProperty(value = "")
  @JsonProperty("param0Field")
  public ArrayType<@Valid Param1DefType> getParam0Field() {
    return param0Field;
  }

  public void setParam0Field(ArrayType<@Valid Param1DefType> param0Field) {
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

