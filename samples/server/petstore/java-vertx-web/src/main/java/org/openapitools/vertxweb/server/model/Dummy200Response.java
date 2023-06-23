package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.Dummy200ResponseOuterProp;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Dummy200Response   {
  
  private Dummy200ResponseOuterProp outerProp;

  public Dummy200Response () {

  }

  public Dummy200Response (Dummy200ResponseOuterProp outerProp) {
    this.outerProp = outerProp;
  }

    
  @JsonProperty("outerProp")
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
