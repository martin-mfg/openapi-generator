package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * ContainerDefaultValue
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ContainerDefaultValue {

  @Valid
  private java.util.List<String> nullableArray;

  @Valid
  private java.util.List<String> nullableRequiredArray;

  @Valid
  private java.util.List<String> requiredArray = new java.util.ArrayList<>();

  @Valid
  private java.util.List<String> nullableArrayWithDefault = new ArrayList<>(Arrays.asList("foo", "bar"));

  /**
   * Default constructor
   * @deprecated Use {@link ContainerDefaultValue#ContainerDefaultValue(java.util.List<String>, java.util.List<String>)}
   */
  @Deprecated
  public ContainerDefaultValue() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ContainerDefaultValue(java.util.List<String> nullableRequiredArray, java.util.List<String> requiredArray) {
    this.nullableRequiredArray = nullableRequiredArray;
    this.requiredArray = requiredArray;
  }

  public ContainerDefaultValue nullableArray(java.util.List<String> nullableArray) {
    this.nullableArray = nullableArray;
    return this;
  }

  public ContainerDefaultValue addNullableArrayItem(String nullableArrayItem) {
    if (this.nullableArray == null) {
      this.nullableArray = new ArrayList<>();
    }
    this.nullableArray.add(nullableArrayItem);
    return this;
  }

  /**
   * Get nullableArray
   * @return nullableArray
  */
  
  @ApiModelProperty(value = "")
  @JsonProperty("nullable_array")
  public java.util.List<String> getNullableArray() {
    return nullableArray;
  }

  public void setNullableArray(java.util.List<String> nullableArray) {
    this.nullableArray = nullableArray;
  }

  public ContainerDefaultValue nullableRequiredArray(java.util.List<String> nullableRequiredArray) {
    this.nullableRequiredArray = nullableRequiredArray;
    return this;
  }

  public ContainerDefaultValue addNullableRequiredArrayItem(String nullableRequiredArrayItem) {
    if (this.nullableRequiredArray == null) {
      this.nullableRequiredArray = new ArrayList<>();
    }
    this.nullableRequiredArray.add(nullableRequiredArrayItem);
    return this;
  }

  /**
   * Get nullableRequiredArray
   * @return nullableRequiredArray
  */
  @NotNull 
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("nullable_required_array")
  public java.util.List<String> getNullableRequiredArray() {
    return nullableRequiredArray;
  }

  public void setNullableRequiredArray(java.util.List<String> nullableRequiredArray) {
    this.nullableRequiredArray = nullableRequiredArray;
  }

  public ContainerDefaultValue requiredArray(java.util.List<String> requiredArray) {
    this.requiredArray = requiredArray;
    return this;
  }

  public ContainerDefaultValue addRequiredArrayItem(String requiredArrayItem) {
    if (this.requiredArray == null) {
      this.requiredArray = new java.util.ArrayList<>();
    }
    this.requiredArray.add(requiredArrayItem);
    return this;
  }

  /**
   * Get requiredArray
   * @return requiredArray
  */
  @NotNull 
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("required_array")
  public java.util.List<String> getRequiredArray() {
    return requiredArray;
  }

  public void setRequiredArray(java.util.List<String> requiredArray) {
    this.requiredArray = requiredArray;
  }

  public ContainerDefaultValue nullableArrayWithDefault(java.util.List<String> nullableArrayWithDefault) {
    this.nullableArrayWithDefault = nullableArrayWithDefault;
    return this;
  }

  public ContainerDefaultValue addNullableArrayWithDefaultItem(String nullableArrayWithDefaultItem) {
    if (this.nullableArrayWithDefault == null) {
      this.nullableArrayWithDefault = new ArrayList<>(Arrays.asList("foo", "bar"));
    }
    this.nullableArrayWithDefault.add(nullableArrayWithDefaultItem);
    return this;
  }

  /**
   * Get nullableArrayWithDefault
   * @return nullableArrayWithDefault
  */
  
  @ApiModelProperty(value = "")
  @JsonProperty("nullable_array_with_default")
  public java.util.List<String> getNullableArrayWithDefault() {
    return nullableArrayWithDefault;
  }

  public void setNullableArrayWithDefault(java.util.List<String> nullableArrayWithDefault) {
    this.nullableArrayWithDefault = nullableArrayWithDefault;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerDefaultValue containerDefaultValue = (ContainerDefaultValue) o;
    return Objects.equals(this.nullableArray, containerDefaultValue.nullableArray) &&
        Objects.equals(this.nullableRequiredArray, containerDefaultValue.nullableRequiredArray) &&
        Objects.equals(this.requiredArray, containerDefaultValue.requiredArray) &&
        Objects.equals(this.nullableArrayWithDefault, containerDefaultValue.nullableArrayWithDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nullableArray, nullableRequiredArray, requiredArray, nullableArrayWithDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerDefaultValue {\n");
    sb.append("    nullableArray: ").append(toIndentedString(nullableArray)).append("\n");
    sb.append("    nullableRequiredArray: ").append(toIndentedString(nullableRequiredArray)).append("\n");
    sb.append("    requiredArray: ").append(toIndentedString(requiredArray)).append("\n");
    sb.append("    nullableArrayWithDefault: ").append(toIndentedString(nullableArrayWithDefault)).append("\n");
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

