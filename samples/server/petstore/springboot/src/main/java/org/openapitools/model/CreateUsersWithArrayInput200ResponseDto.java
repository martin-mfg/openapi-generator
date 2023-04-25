package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.xyz.MyIntArraySchema;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateUsersWithArrayInput200ResponseDto
 */

@JsonTypeName("createUsersWithArrayInput_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CreateUsersWithArrayInput200ResponseDto {

  private MyIntArraySchema myField;

  public CreateUsersWithArrayInput200ResponseDto myField(MyIntArraySchema myField) {
    this.myField = myField;
    return this;
  }

  /**
   * Get myField
   * @return myField
  */
  @Valid 
  @ApiModelProperty(value = "")
  @JsonProperty("myField")
  public MyIntArraySchema getMyField() {
    return myField;
  }

  public void setMyField(MyIntArraySchema myField) {
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
    CreateUsersWithArrayInput200ResponseDto createUsersWithArrayInput200Response = (CreateUsersWithArrayInput200ResponseDto) o;
    return Objects.equals(this.myField, createUsersWithArrayInput200Response.myField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUsersWithArrayInput200ResponseDto {\n");
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

