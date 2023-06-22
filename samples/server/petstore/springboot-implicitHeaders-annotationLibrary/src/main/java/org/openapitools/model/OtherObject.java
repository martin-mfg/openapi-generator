package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ExampleResponse;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * dummy
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OtherObject {

  private ExampleResponse myOnlyProperty2;

  public OtherObject myOnlyProperty2(ExampleResponse myOnlyProperty2) {
    this.myOnlyProperty2 = myOnlyProperty2;
    return this;
  }

  /**
   * Get myOnlyProperty2
   * @return myOnlyProperty2
  */
  @Valid 
  @JsonProperty("myOnlyProperty2")
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
}

