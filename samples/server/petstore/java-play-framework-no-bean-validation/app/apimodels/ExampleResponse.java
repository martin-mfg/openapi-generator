package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
/**
 * dummy
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ExampleResponse   {
  @JsonProperty("emptyString")
  private String emptyString = "";

  @JsonProperty("numberString")
  private String numberString = "42";

  @JsonProperty("boolString")
  private String boolString = "false";

  @JsonProperty("nullString")
  private String nullString = "null";

  @JsonProperty("aBool")
  private Boolean aBool = false;

  @JsonProperty("zero")
  private Integer zero = 0;

  public ExampleResponse emptyString(String emptyString) {
    this.emptyString = emptyString;
    return this;
  }

   /**
   * Get emptyString
   * @return emptyString
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

