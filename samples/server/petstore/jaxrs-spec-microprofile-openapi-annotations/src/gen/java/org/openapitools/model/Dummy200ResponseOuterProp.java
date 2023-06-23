package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Dummy200ResponseOuterPropInnerProp;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@org.eclipse.microprofile.openapi.annotations.media.Schema(description="")
@JsonTypeName("dummy_200_response_outerProp")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class Dummy200ResponseOuterProp  implements Serializable {
  private @Valid Dummy200ResponseOuterPropInnerProp innerProp;

  protected Dummy200ResponseOuterProp(Dummy200ResponseOuterPropBuilder<?, ?> b) {
    this.innerProp = b.innerProp;
  }

  public Dummy200ResponseOuterProp() {
  }

  /**
   **/
  public Dummy200ResponseOuterProp innerProp(Dummy200ResponseOuterPropInnerProp innerProp) {
    this.innerProp = innerProp;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @org.eclipse.microprofile.openapi.annotations.media.Schema(description = "")
  @JsonProperty("innerProp")
  public Dummy200ResponseOuterPropInnerProp getInnerProp() {
    return innerProp;
  }

  @JsonProperty("innerProp")
  public void setInnerProp(Dummy200ResponseOuterPropInnerProp innerProp) {
    this.innerProp = innerProp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dummy200ResponseOuterProp dummy200ResponseOuterProp = (Dummy200ResponseOuterProp) o;
    return Objects.equals(this.innerProp, dummy200ResponseOuterProp.innerProp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(innerProp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dummy200ResponseOuterProp {\n");
    
    sb.append("    innerProp: ").append(toIndentedString(innerProp)).append("\n");
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


  public static Dummy200ResponseOuterPropBuilder<?, ?> builder() {
    return new Dummy200ResponseOuterPropBuilderImpl();
  }

  private static final class Dummy200ResponseOuterPropBuilderImpl extends Dummy200ResponseOuterPropBuilder<Dummy200ResponseOuterProp, Dummy200ResponseOuterPropBuilderImpl> {

    @Override
    protected Dummy200ResponseOuterPropBuilderImpl self() {
      return this;
    }

    @Override
    public Dummy200ResponseOuterProp build() {
      return new Dummy200ResponseOuterProp(this);
    }
  }

  public static abstract class Dummy200ResponseOuterPropBuilder<C extends Dummy200ResponseOuterProp, B extends Dummy200ResponseOuterPropBuilder<C, B>>  {
    private Dummy200ResponseOuterPropInnerProp innerProp;
    protected abstract B self();

    public abstract C build();

    public B innerProp(Dummy200ResponseOuterPropInnerProp innerProp) {
      this.innerProp = innerProp;
      return self();
    }
  }
}

