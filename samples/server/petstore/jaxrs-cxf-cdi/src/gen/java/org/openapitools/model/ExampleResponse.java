package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "")
public class ExampleResponse   {
  
  private List<Boolean> myOnlyProperty;

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

