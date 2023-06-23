package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Dummy200ResponseOuterProp;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("dummy_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class Dummy200Response  implements Serializable {
  private @Valid Dummy200ResponseOuterProp outerProp;

  protected Dummy200Response(Dummy200ResponseBuilder<?, ?> b) {
    this.outerProp = b.outerProp;
  }

  public Dummy200Response() {
  }

  /**
   **/
  public Dummy200Response outerProp(Dummy200ResponseOuterProp outerProp) {
    this.outerProp = outerProp;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("outerProp")
  public Dummy200ResponseOuterProp getOuterProp() {
    return outerProp;
  }

  @JsonProperty("outerProp")
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
    return Objects.equals(this.outerProp, dummy200Response.outerProp);
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


  public static Dummy200ResponseBuilder<?, ?> builder() {
    return new Dummy200ResponseBuilderImpl();
  }

  private static final class Dummy200ResponseBuilderImpl extends Dummy200ResponseBuilder<Dummy200Response, Dummy200ResponseBuilderImpl> {

    @Override
    protected Dummy200ResponseBuilderImpl self() {
      return this;
    }

    @Override
    public Dummy200Response build() {
      return new Dummy200Response(this);
    }
  }

  public static abstract class Dummy200ResponseBuilder<C extends Dummy200Response, B extends Dummy200ResponseBuilder<C, B>>  {
    private Dummy200ResponseOuterProp outerProp;
    protected abstract B self();

    public abstract C build();

    public B outerProp(Dummy200ResponseOuterProp outerProp) {
      this.outerProp = outerProp;
      return self();
    }
  }
}

