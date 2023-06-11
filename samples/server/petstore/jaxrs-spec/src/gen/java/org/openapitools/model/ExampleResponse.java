package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ExampleResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class ExampleResponse  implements Serializable {
  private @Valid List<Boolean> myOnlyProperty;

  protected ExampleResponse(ExampleResponseBuilder<?, ?> b) {
    this.myOnlyProperty = b.myOnlyProperty;
  }

  public ExampleResponse() {
  }

  /**
   **/
  public ExampleResponse myOnlyProperty(List<Boolean> myOnlyProperty) {
    this.myOnlyProperty = myOnlyProperty;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("myOnlyProperty")
  public List<Boolean> getMyOnlyProperty() {
    return myOnlyProperty;
  }

  @JsonProperty("myOnlyProperty")
  public void setMyOnlyProperty(List<Boolean> myOnlyProperty) {
    this.myOnlyProperty = myOnlyProperty;
  }

  public ExampleResponse addMyOnlyPropertyItem(Boolean myOnlyPropertyItem) {
    if (this.myOnlyProperty == null) {
      this.myOnlyProperty = new ArrayList<>();
    }

    this.myOnlyProperty.add(myOnlyPropertyItem);
    return this;
  }

  public ExampleResponse removeMyOnlyPropertyItem(Boolean myOnlyPropertyItem) {
    if (myOnlyPropertyItem != null && this.myOnlyProperty != null) {
      this.myOnlyProperty.remove(myOnlyPropertyItem);
    }

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
    ExampleResponse exampleResponse = (ExampleResponse) o;
    return Objects.equals(this.myOnlyProperty, exampleResponse.myOnlyProperty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myOnlyProperty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExampleResponse {\n");
    
    sb.append("    myOnlyProperty: ").append(toIndentedString(myOnlyProperty)).append("\n");
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
    private List<Boolean> myOnlyProperty;
    protected abstract B self();

    public abstract C build();

    public B myOnlyProperty(List<Boolean> myOnlyProperty) {
      this.myOnlyProperty = myOnlyProperty;
      return self();
    }
  }
}

