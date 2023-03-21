package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ReadOnlyFirstDto;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * ArrayTestDto
 */

@JsonTypeName("ArrayTest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ArrayTestDto {

  @Valid
  private java.util.List<String> arrayOfString;

  @Valid
  private java.util.List<java.util.List<Long>> arrayArrayOfInteger;

  @Valid
  private java.util.List<java.util.List<ReadOnlyFirstDto>> arrayArrayOfModel;

  public ArrayTestDto arrayOfString(java.util.List<String> arrayOfString) {
    this.arrayOfString = arrayOfString;
    return this;
  }

  public ArrayTestDto addArrayOfStringItem(String arrayOfStringItem) {
    if (this.arrayOfString == null) {
      this.arrayOfString = new ArrayList<>();
    }
    this.arrayOfString.add(arrayOfStringItem);
    return this;
  }

  /**
   * Get arrayOfString
   * @return arrayOfString
  */
  
  @ApiModelProperty(value = "")
  @JsonProperty("array_of_string")
  public java.util.List<String> getArrayOfString() {
    return arrayOfString;
  }

  public void setArrayOfString(java.util.List<String> arrayOfString) {
    this.arrayOfString = arrayOfString;
  }

  public ArrayTestDto arrayArrayOfInteger(java.util.List<java.util.List<Long>> arrayArrayOfInteger) {
    this.arrayArrayOfInteger = arrayArrayOfInteger;
    return this;
  }

  public ArrayTestDto addArrayArrayOfIntegerItem(java.util.List<Long> arrayArrayOfIntegerItem) {
    if (this.arrayArrayOfInteger == null) {
      this.arrayArrayOfInteger = new ArrayList<>();
    }
    this.arrayArrayOfInteger.add(arrayArrayOfIntegerItem);
    return this;
  }

  /**
   * Get arrayArrayOfInteger
   * @return arrayArrayOfInteger
  */
  @Valid 
  @ApiModelProperty(value = "")
  @JsonProperty("array_array_of_integer")
  public java.util.List<java.util.List<Long>> getArrayArrayOfInteger() {
    return arrayArrayOfInteger;
  }

  public void setArrayArrayOfInteger(java.util.List<java.util.List<Long>> arrayArrayOfInteger) {
    this.arrayArrayOfInteger = arrayArrayOfInteger;
  }

  public ArrayTestDto arrayArrayOfModel(java.util.List<java.util.List<ReadOnlyFirstDto>> arrayArrayOfModel) {
    this.arrayArrayOfModel = arrayArrayOfModel;
    return this;
  }

  public ArrayTestDto addArrayArrayOfModelItem(java.util.List<@Valid ReadOnlyFirstDto> arrayArrayOfModelItem) {
    if (this.arrayArrayOfModel == null) {
      this.arrayArrayOfModel = new ArrayList<>();
    }
    this.arrayArrayOfModel.add(arrayArrayOfModelItem);
    return this;
  }

  /**
   * Get arrayArrayOfModel
   * @return arrayArrayOfModel
  */
  @Valid 
  @ApiModelProperty(value = "")
  @JsonProperty("array_array_of_model")
  public java.util.List<java.util.List<ReadOnlyFirstDto>> getArrayArrayOfModel() {
    return arrayArrayOfModel;
  }

  public void setArrayArrayOfModel(java.util.List<java.util.List<ReadOnlyFirstDto>> arrayArrayOfModel) {
    this.arrayArrayOfModel = arrayArrayOfModel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArrayTestDto arrayTest = (ArrayTestDto) o;
    return Objects.equals(this.arrayOfString, arrayTest.arrayOfString) &&
        Objects.equals(this.arrayArrayOfInteger, arrayTest.arrayArrayOfInteger) &&
        Objects.equals(this.arrayArrayOfModel, arrayTest.arrayArrayOfModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrayOfString, arrayArrayOfInteger, arrayArrayOfModel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayTestDto {\n");
    sb.append("    arrayOfString: ").append(toIndentedString(arrayOfString)).append("\n");
    sb.append("    arrayArrayOfInteger: ").append(toIndentedString(arrayArrayOfInteger)).append("\n");
    sb.append("    arrayArrayOfModel: ").append(toIndentedString(arrayArrayOfModel)).append("\n");
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

