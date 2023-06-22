package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.OtherObject;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * dummy
 */

@Schema(name = "ExampleResponse", description = "dummy")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ExampleResponse {

  private OtherObject myOnlyProperty;

  public ExampleResponse myOnlyProperty(OtherObject myOnlyProperty) {
    this.myOnlyProperty = myOnlyProperty;
    return this;
  }

  /**
   * Get myOnlyProperty
   * @return myOnlyProperty
  */
  @Valid 
  @Schema(name = "myOnlyProperty", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("myOnlyProperty")
  public OtherObject getMyOnlyProperty() {
    return myOnlyProperty;
  }

  public void setMyOnlyProperty(OtherObject myOnlyProperty) {
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
}

