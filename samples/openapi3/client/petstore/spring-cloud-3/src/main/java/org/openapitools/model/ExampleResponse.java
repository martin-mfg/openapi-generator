package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * dummy
 */

@Schema(name = "ExampleResponse", description = "dummy")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ExampleResponse {

  private String emptyString = "";

  private String numberString = "42";

  private String boolString = "false";

  private String nullString = "null";

  private Boolean aBool = false;

  private Integer zero = 0;

  public ExampleResponse emptyString(String emptyString) {
    this.emptyString = emptyString;
    return this;
  }

  /**
   * Get emptyString
   * @return emptyString
  */
  
  @Schema(name = "emptyString", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emptyString")
  public String getEmptyString() {
    return emptyString;
  }

  public void setEmptyString(String emptyString) {
    this.emptyString = emptyString;
  }

  public ExampleResponse numberString(String numberString) {
    this.numberString = numberString;
    return this;
  }

  /**
   * Get numberString
   * @return numberString
  */
  
  @Schema(name = "numberString", example = "42", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numberString")
  public String getNumberString() {
    return numberString;
  }

  public void setNumberString(String numberString) {
    this.numberString = numberString;
  }

  public ExampleResponse boolString(String boolString) {
    this.boolString = boolString;
    return this;
  }

  /**
   * Get boolString
   * @return boolString
  */
  
  @Schema(name = "boolString", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("boolString")
  public String getBoolString() {
    return boolString;
  }

  public void setBoolString(String boolString) {
    this.boolString = boolString;
  }

  public ExampleResponse nullString(String nullString) {
    this.nullString = nullString;
    return this;
  }

  /**
   * Get nullString
   * @return nullString
  */
  
  @Schema(name = "nullString", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nullString")
  public String getNullString() {
    return nullString;
  }

  public void setNullString(String nullString) {
    this.nullString = nullString;
  }

  public ExampleResponse aBool(Boolean aBool) {
    this.aBool = aBool;
    return this;
  }

  /**
   * Get aBool
   * @return aBool
  */
  
  @Schema(name = "aBool", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aBool")
  public Boolean getaBool() {
    return aBool;
  }

  public void setaBool(Boolean aBool) {
    this.aBool = aBool;
  }

  public ExampleResponse zero(Integer zero) {
    this.zero = zero;
    return this;
  }

  /**
   * Get zero
   * @return zero
  */
  
  @Schema(name = "zero", example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

