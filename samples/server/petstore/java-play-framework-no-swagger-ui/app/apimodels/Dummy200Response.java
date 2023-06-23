package apimodels;

import apimodels.Dummy200ResponseOuterProp;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Dummy200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Dummy200Response   {
  @JsonProperty("outerProp")
  @Valid

  private Dummy200ResponseOuterProp outerProp;

  public Dummy200Response outerProp(Dummy200ResponseOuterProp outerProp) {
    this.outerProp = outerProp;
    return this;
  }

   /**
   * Get outerProp
   * @return outerProp
  **/
  public Dummy200ResponseOuterProp getOuterProp() {
    return outerProp;
  }

  public void setOuterProp(Dummy200ResponseOuterProp outerProp) {
    this.outerProp = outerProp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dummy200Response dummy200Response = (Dummy200Response) o;
    return Objects.equals(outerProp, dummy200Response.outerProp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outerProp);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dummy200Response {\n");
    
    sb.append("    outerProp: ").append(toIndentedString(outerProp)).append("\n");
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

