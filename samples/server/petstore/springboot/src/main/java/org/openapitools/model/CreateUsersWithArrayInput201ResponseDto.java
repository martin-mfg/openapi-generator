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
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateUsersWithArrayInput201ResponseDto
 */

@JsonTypeName("createUsersWithArrayInput_201_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CreateUsersWithArrayInput201ResponseDto {

  @Valid
  private ArrayType<Integer> myField;

  public CreateUsersWithArrayInput201ResponseDto myField(ArrayType<Integer> myField) {
    this.myField = myField;
    return this;
  }

  public CreateUsersWithArrayInput201ResponseDto addMyFieldItem(Integer myFieldItem) {
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("myField")
  public ArrayType<Integer> getMyField() {
    return myField;
  }

  public void setMyField(ArrayType<Integer> myField) {
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
    CreateUsersWithArrayInput201ResponseDto createUsersWithArrayInput201Response = (CreateUsersWithArrayInput201ResponseDto) o;
    return Objects.equals(this.myField, createUsersWithArrayInput201Response.myField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUsersWithArrayInput201ResponseDto {\n");
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

