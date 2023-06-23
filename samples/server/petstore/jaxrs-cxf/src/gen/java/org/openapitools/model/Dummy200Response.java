package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.Dummy200ResponseOuterProp;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Dummy200Response  {
  
  @ApiModelProperty(value = "")
  @Valid
  private Dummy200ResponseOuterProp outerProp;
 /**
   * Get outerProp
   * @return outerProp
  **/
  @JsonProperty("outerProp")
  public Dummy200ResponseOuterProp getOuterProp() {
    return outerProp;
  }

  public void setOuterProp(Dummy200ResponseOuterProp outerProp) {
    this.outerProp = outerProp;
  }

  public Dummy200Response outerProp(Dummy200ResponseOuterProp outerProp) {
    this.outerProp = outerProp;
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
    Dummy200Response dummy200Response = (Dummy200Response) o;
    return Objects.equals(outerProp, dummy200Response.outerProp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outerProp);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

