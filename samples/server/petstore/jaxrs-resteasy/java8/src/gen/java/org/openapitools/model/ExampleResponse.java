package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;
import javax.validation.Valid;

@ApiModel(description="dummy")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen")
public class ExampleResponse   {
  
  private String emptyString = "";
  private String numberString = "42";
  private String boolString = "false";
  private String nullString = "null";
  private Boolean aBool = false;
  private Integer zero = 0;

  /**
   **/
  
  @ApiModelProperty(example = "", value = "")
  @JsonProperty("emptyString")
  public String getEmptyString() {
    return emptyString;
  }
  public void setEmptyString(String emptyString) {
    this.emptyString = emptyString;
  }

  /**
   **/
  
  @ApiModelProperty(example = "42", value = "")
  @JsonProperty("numberString")
  public String getNumberString() {
    return numberString;
  }
  public void setNumberString(String numberString) {
    this.numberString = numberString;
  }

  /**
   **/
  
  @ApiModelProperty(example = "false", value = "")
  @JsonProperty("boolString")
  public String getBoolString() {
    return boolString;
  }
  public void setBoolString(String boolString) {
    this.boolString = boolString;
  }

  /**
   **/
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nullString")
  public String getNullString() {
    return nullString;
  }
  public void setNullString(String nullString) {
    this.nullString = nullString;
  }

  /**
   **/
  
  @ApiModelProperty(example = "false", value = "")
  @JsonProperty("aBool")
  public Boolean getaBool() {
    return aBool;
  }
  public void setaBool(Boolean aBool) {
    this.aBool = aBool;
  }

  /**
   **/
  
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty("zero")
  public Integer getZero() {
    return zero;
  }
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
    return Objects.equals(emptyString, exampleResponse.emptyString) &&
        Objects.equals(numberString, exampleResponse.numberString) &&
        Objects.equals(boolString, exampleResponse.boolString) &&
        Objects.equals(nullString, exampleResponse.nullString) &&
        Objects.equals(aBool, exampleResponse.aBool) &&
        Objects.equals(zero, exampleResponse.zero);
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

