package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ExampleResponse;
import javax.validation.constraints.*;
import io.swagger.annotations.*;
import javax.validation.Valid;

@ApiModel(description="dummy")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen")
public class OtherObject   {
  
  private ExampleResponse myOnlyProperty2;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("myOnlyProperty2")
  @Valid
  public ExampleResponse getMyOnlyProperty2() {
    return myOnlyProperty2;
  }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

