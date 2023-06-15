package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * dummy
 **/
@ApiModel(description = "dummy")
@JsonTypeName("ExampleResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class ExampleResponse  implements Serializable {
  private @Valid String emptyString = "";
  private @Valid String numberString = "42";
  private @Valid String boolString = "false";
  private @Valid String nullString = "null";
  private @Valid Boolean aBool = false;
  private @Valid Integer zero = 0;

  /**
   **/
  public ExampleResponse emptyString(String emptyString) {
    this.emptyString = emptyString;
    return this;
  }

  
  @ApiModelProperty(example = "", value = "")
  @JsonProperty("emptyString")
  public String getEmptyString() {
    return emptyString;
  }

  @JsonProperty("emptyString")
  public void setEmptyString(String emptyString) {
    this.emptyString = emptyString;
  }

  /**
   **/
  public ExampleResponse numberString(String numberString) {
    this.numberString = numberString;
    return this;
  }

  
  @ApiModelProperty(example = "42", value = "")
  @JsonProperty("numberString")
  public String getNumberString() {
    return numberString;
  }

  @JsonProperty("numberString")
  public void setNumberString(String numberString) {
    this.numberString = numberString;
  }

  /**
   **/
  public ExampleResponse boolString(String boolString) {
    this.boolString = boolString;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "")
  @JsonProperty("boolString")
  public String getBoolString() {
    return boolString;
  }

  @JsonProperty("boolString")
  public void setBoolString(String boolString) {
    this.boolString = boolString;
  }

  /**
   **/
  public ExampleResponse nullString(String nullString) {
    this.nullString = nullString;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nullString")
  public String getNullString() {
    return nullString;
  }

  @JsonProperty("nullString")
  public void setNullString(String nullString) {
    this.nullString = nullString;
  }

  /**
   **/
  public ExampleResponse aBool(Boolean aBool) {
    this.aBool = aBool;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "")
  @JsonProperty("aBool")
  public Boolean getaBool() {
    return aBool;
  }

  @JsonProperty("aBool")
  public void setaBool(Boolean aBool) {
    this.aBool = aBool;
  }

  /**
   **/
  public ExampleResponse zero(Integer zero) {
    this.zero = zero;
    return this;
  }

  
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty("zero")
  public Integer getZero() {
    return zero;
  }

  @JsonProperty("zero")
  public void setZero(Integer zero) {
    this.zero = zero;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExampleResponse exampleResponse = (ExampleResponse) o;
    return Objects.equals(this.emptyString, exampleResponse.emptyString) &&
        Objects.equals(this.numberString, exampleResponse.numberString) &&
        Objects.equals(this.boolString, exampleResponse.boolString) &&
        Objects.equals(this.nullString, exampleResponse.nullString) &&
        Objects.equals(this.aBool, exampleResponse.aBool) &&
        Objects.equals(this.zero, exampleResponse.zero);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emptyString, numberString, boolString, nullString, aBool, zero);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExampleResponse {\n");
    
    sb.append("    emptyString: ").append(toIndentedString(emptyString)).append("\n");
    sb.append("    numberString: ").append(toIndentedString(numberString)).append("\n");
    sb.append("    boolString: ").append(toIndentedString(boolString)).append("\n");
    sb.append("    nullString: ").append(toIndentedString(nullString)).append("\n");
    sb.append("    aBool: ").append(toIndentedString(aBool)).append("\n");
    sb.append("    zero: ").append(toIndentedString(zero)).append("\n");
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

