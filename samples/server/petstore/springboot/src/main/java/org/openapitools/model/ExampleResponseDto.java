package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OtherObjectDto;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * dummy
 */

@ApiModel(description = "dummy")
@JsonTypeName("ExampleResponse")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ExampleResponseDto {

  private OtherObjectDto myOnlyProperty;

  public ExampleResponseDto myOnlyProperty(OtherObjectDto myOnlyProperty) {
    this.myOnlyProperty = myOnlyProperty;
    return this;
  }

  /**
   * Get myOnlyProperty
   * @return myOnlyProperty
  */
  @Valid 
  @ApiModelProperty(value = "")
  @JsonProperty("myOnlyProperty")
  public OtherObjectDto getMyOnlyProperty() {
    return myOnlyProperty;
  }

  public void setMyOnlyProperty(OtherObjectDto myOnlyProperty) {
    this.myOnlyProperty = myOnlyProperty;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExampleResponseDto exampleResponse = (ExampleResponseDto) o;
    return Objects.equals(this.myOnlyProperty, exampleResponse.myOnlyProperty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myOnlyProperty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExampleResponseDto {\n");
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

