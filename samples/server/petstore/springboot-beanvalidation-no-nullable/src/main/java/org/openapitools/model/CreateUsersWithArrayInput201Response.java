package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateUsersWithArrayInput201Response
 */

@JsonTypeName("createUsersWithArrayInput_201_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CreateUsersWithArrayInput201Response {

  @Valid
  private List<Integer> myField;

  public CreateUsersWithArrayInput201Response myField(List<Integer> myField) {
    this.myField = myField;
    return this;
  }

  public CreateUsersWithArrayInput201Response addMyFieldItem(Integer myFieldItem) {
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
    CreateUsersWithArrayInput201Response createUsersWithArrayInput201Response = (CreateUsersWithArrayInput201Response) o;
    return Objects.equals(this.myField, createUsersWithArrayInput201Response.myField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUsersWithArrayInput201Response {\n");
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

