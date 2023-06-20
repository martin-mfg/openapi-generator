package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.validation.constraints.*;

/**
 * dummy
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "dummy")
public class ExampleResponse   {
  
  private Set<BigDecimal> myOnlyProperty;

  /**
   **/
  public ExampleResponse myOnlyProperty(Set<BigDecimal> myOnlyProperty) {
    this.myOnlyProperty = myOnlyProperty;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("myOnlyProperty")
  public Set<BigDecimal> getMyOnlyProperty() {
    return myOnlyProperty;
  }
  @JsonDeserialize(as = LinkedHashSet.class)
  public void setMyOnlyProperty(Set<BigDecimal> myOnlyProperty) {
    this.myOnlyProperty = myOnlyProperty;
  }

  public ExampleResponse addMyOnlyPropertyItem(BigDecimal myOnlyPropertyItem) {
    if (this.myOnlyProperty == null) {
      this.myOnlyProperty = new LinkedHashSet<>();
    }
    this.myOnlyProperty.add(myOnlyPropertyItem);
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
    return Objects.equals(myOnlyProperty, exampleResponse.myOnlyProperty);
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
}

