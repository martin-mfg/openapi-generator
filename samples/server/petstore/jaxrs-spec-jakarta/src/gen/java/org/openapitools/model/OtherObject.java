package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ExampleResponse;
import java.io.Serializable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

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
@JsonTypeName("OtherObject")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class OtherObject  implements Serializable {
  private @Valid ExampleResponse myOnlyProperty2;

  protected OtherObject(OtherObjectBuilder<?, ?> b) {
    this.myOnlyProperty2 = b.myOnlyProperty2;
  }

  public OtherObject() {
  }

  /**
   **/
  public OtherObject myOnlyProperty2(ExampleResponse myOnlyProperty2) {
    this.myOnlyProperty2 = myOnlyProperty2;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("myOnlyProperty2")
  public ExampleResponse getMyOnlyProperty2() {
    return myOnlyProperty2;
  }

  @JsonProperty("myOnlyProperty2")
  public void setMyOnlyProperty2(ExampleResponse myOnlyProperty2) {
    this.myOnlyProperty2 = myOnlyProperty2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtherObject otherObject = (OtherObject) o;
    return Objects.equals(this.myOnlyProperty2, otherObject.myOnlyProperty2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myOnlyProperty2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherObject {\n");
    
    sb.append("    myOnlyProperty2: ").append(toIndentedString(myOnlyProperty2)).append("\n");
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


  public static OtherObjectBuilder<?, ?> builder() {
    return new OtherObjectBuilderImpl();
  }

  private static final class OtherObjectBuilderImpl extends OtherObjectBuilder<OtherObject, OtherObjectBuilderImpl> {

    @Override
    protected OtherObjectBuilderImpl self() {
      return this;
    }

    @Override
    public OtherObject build() {
      return new OtherObject(this);
    }
  }

  public static abstract class OtherObjectBuilder<C extends OtherObject, B extends OtherObjectBuilder<C, B>>  {
    private ExampleResponse myOnlyProperty2;
    protected abstract B self();

    public abstract C build();

    public B myOnlyProperty2(ExampleResponse myOnlyProperty2) {
      this.myOnlyProperty2 = myOnlyProperty2;
      return self();
    }
  }
}

