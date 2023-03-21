package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ReadOnlyFirst;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ArrayTest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class ArrayTest  implements Serializable {
  private @Valid java.util.List<String> arrayOfString;
  private @Valid java.util.List<java.util.List<Long>> arrayArrayOfInteger;
  private @Valid java.util.List<java.util.List<ReadOnlyFirst>> arrayArrayOfModel;

  /**
   **/
  public ArrayTest arrayOfString(java.util.List<String> arrayOfString) {
    this.arrayOfString = arrayOfString;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("array_of_string")
  public java.util.List<String> getArrayOfString() {
    return arrayOfString;
  }

  @JsonProperty("array_of_string")
  public void setArrayOfString(java.util.List<String> arrayOfString) {
    this.arrayOfString = arrayOfString;
  }

  public ArrayTest addArrayOfStringItem(String arrayOfStringItem) {
    if (this.arrayOfString == null) {
      this.arrayOfString = new ArrayList<>();
    }

    this.arrayOfString.add(arrayOfStringItem);
    return this;
  }

  public ArrayTest removeArrayOfStringItem(String arrayOfStringItem) {
    if (arrayOfStringItem != null && this.arrayOfString != null) {
      this.arrayOfString.remove(arrayOfStringItem);
    }

    return this;
  }
  /**
   **/
  public ArrayTest arrayArrayOfInteger(java.util.List<java.util.List<Long>> arrayArrayOfInteger) {
    this.arrayArrayOfInteger = arrayArrayOfInteger;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("array_array_of_integer")
  public java.util.List<java.util.List<Long>> getArrayArrayOfInteger() {
    return arrayArrayOfInteger;
  }

  @JsonProperty("array_array_of_integer")
  public void setArrayArrayOfInteger(java.util.List<java.util.List<Long>> arrayArrayOfInteger) {
    this.arrayArrayOfInteger = arrayArrayOfInteger;
  }

  public ArrayTest addArrayArrayOfIntegerItem(java.util.List<Long> arrayArrayOfIntegerItem) {
    if (this.arrayArrayOfInteger == null) {
      this.arrayArrayOfInteger = new ArrayList<>();
    }

    this.arrayArrayOfInteger.add(arrayArrayOfIntegerItem);
    return this;
  }

  public ArrayTest removeArrayArrayOfIntegerItem(java.util.List<Long> arrayArrayOfIntegerItem) {
    if (arrayArrayOfIntegerItem != null && this.arrayArrayOfInteger != null) {
      this.arrayArrayOfInteger.remove(arrayArrayOfIntegerItem);
    }

    return this;
  }
  /**
   **/
  public ArrayTest arrayArrayOfModel(java.util.List<java.util.List<ReadOnlyFirst>> arrayArrayOfModel) {
    this.arrayArrayOfModel = arrayArrayOfModel;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("array_array_of_model")
  public java.util.List<java.util.List<ReadOnlyFirst>> getArrayArrayOfModel() {
    return arrayArrayOfModel;
  }

  @JsonProperty("array_array_of_model")
  public void setArrayArrayOfModel(java.util.List<java.util.List<ReadOnlyFirst>> arrayArrayOfModel) {
    this.arrayArrayOfModel = arrayArrayOfModel;
  }

  public ArrayTest addArrayArrayOfModelItem(java.util.List<ReadOnlyFirst> arrayArrayOfModelItem) {
    if (this.arrayArrayOfModel == null) {
      this.arrayArrayOfModel = new ArrayList<>();
    }

    this.arrayArrayOfModel.add(arrayArrayOfModelItem);
    return this;
  }

  public ArrayTest removeArrayArrayOfModelItem(java.util.List<ReadOnlyFirst> arrayArrayOfModelItem) {
    if (arrayArrayOfModelItem != null && this.arrayArrayOfModel != null) {
      this.arrayArrayOfModel.remove(arrayArrayOfModelItem);
    }

    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArrayTest arrayTest = (ArrayTest) o;
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
    sb.append("class ArrayTest {\n");
    
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

