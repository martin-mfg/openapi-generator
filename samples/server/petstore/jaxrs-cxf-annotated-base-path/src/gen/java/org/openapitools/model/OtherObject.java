package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.ExampleResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * dummy
 **/
@ApiModel(description="dummy")

public class OtherObject  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ExampleResponse myOnlyProperty2;
 /**
   * Get myOnlyProperty2
   * @return myOnlyProperty2
  **/
  @JsonProperty("myOnlyProperty2")
  public ExampleResponse getMyOnlyProperty2() {
    return myOnlyProperty2;
  }

  public void setMyOnlyProperty2(ExampleResponse myOnlyProperty2) {
    this.myOnlyProperty2 = myOnlyProperty2;
  }

  public OtherObject myOnlyProperty2(ExampleResponse myOnlyProperty2) {
    this.myOnlyProperty2 = myOnlyProperty2;
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
    OtherObject otherObject = (OtherObject) o;
    return Objects.equals(myOnlyProperty2, otherObject.myOnlyProperty2);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

