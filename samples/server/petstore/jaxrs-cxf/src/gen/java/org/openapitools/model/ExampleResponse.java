package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.OtherObject;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * dummy
 **/
@ApiModel(description="dummy")

public class ExampleResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private OtherObject myOnlyProperty;
 /**
   * Get myOnlyProperty
   * @return myOnlyProperty
  **/
  @JsonProperty("myOnlyProperty")
  public OtherObject getMyOnlyProperty() {
    return myOnlyProperty;
  }

  public void setMyOnlyProperty(OtherObject myOnlyProperty) {
    this.myOnlyProperty = myOnlyProperty;
  }

  public ExampleResponse myOnlyProperty(OtherObject myOnlyProperty) {
    this.myOnlyProperty = myOnlyProperty;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

