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
@org.eclipse.microprofile.openapi.annotations.media.Schema(description="dummy")
@JsonTypeName("ExampleResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class ExampleResponse  implements Serializable {
  private @Valid String emptyString = "";
  private @Valid String numberString = "42";
  private @Valid String boolString = "false";
  private @Valid String nullString = "null";
  private @Valid Boolean aBool = false;
  private @Valid Integer zero = 0;

  protected ExampleResponse(ExampleResponseBuilder<?, ?> b) {
    this.emptyString = b.emptyString;
    this.numberString = b.numberString;
    this.boolString = b.boolString;
    this.nullString = b.nullString;
    this.aBool = b.aBool;
    this.zero = b.zero;
  }

  public ExampleResponse() {
  }

  /**
   **/
  public ExampleResponse emptyString(String emptyString) {
    this.emptyString = emptyString;
    return this;
  }

  
  @ApiModelProperty(example = "", value = "")
  @org.eclipse.microprofile.openapi.annotations.media.Schema(example = "", description = "")
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
  @org.eclipse.microprofile.openapi.annotations.media.Schema(example = "42", description = "")
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
  @org.eclipse.microprofile.openapi.annotations.media.Schema(example = "false", description = "")
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
  @org.eclipse.microprofile.openapi.annotations.media.Schema(example = "null", description = "")
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
  @org.eclipse.microprofile.openapi.annotations.media.Schema(example = "false", description = "")
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
  @org.eclipse.microprofile.openapi.annotations.media.Schema(example = "0", description = "")
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


  public static ExampleResponseBuilder<?, ?> builder() {
    return new ExampleResponseBuilderImpl();
  }

  private static final class ExampleResponseBuilderImpl extends ExampleResponseBuilder<ExampleResponse, ExampleResponseBuilderImpl> {

    @Override
    protected ExampleResponseBuilderImpl self() {
      return this;
    }

    @Override
    public ExampleResponse build() {
      return new ExampleResponse(this);
    }
  }

  public static abstract class ExampleResponseBuilder<C extends ExampleResponse, B extends ExampleResponseBuilder<C, B>>  {
    private String emptyString = "";
    private String numberString = "42";
    private String boolString = "false";
    private String nullString = "null";
    private Boolean aBool = false;
    private Integer zero = 0;
    protected abstract B self();

    public abstract C build();

    public B emptyString(String emptyString) {
      this.emptyString = emptyString;
      return self();
    }
    public B numberString(String numberString) {
      this.numberString = numberString;
      return self();
    }
    public B boolString(String boolString) {
      this.boolString = boolString;
      return self();
    }
    public B nullString(String nullString) {
      this.nullString = nullString;
      return self();
    }
    public B aBool(Boolean aBool) {
      this.aBool = aBool;
      return self();
    }
    public B zero(Integer zero) {
      this.zero = zero;
      return self();
    }
  }
}

