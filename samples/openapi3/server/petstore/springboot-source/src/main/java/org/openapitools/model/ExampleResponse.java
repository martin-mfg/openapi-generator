package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;
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
public class ExampleResponse {

  @Valid
  private Set<BigDecimal> myOnlyProperty;

  public ExampleResponse myOnlyProperty(Set<BigDecimal> myOnlyProperty) {
    this.myOnlyProperty = myOnlyProperty;
    return this;
  }

  public ExampleResponse addMyOnlyPropertyItem(BigDecimal myOnlyPropertyItem) {
    if (this.myOnlyProperty == null) {
      this.myOnlyProperty = new LinkedHashSet<>();
    }
    this.myOnlyProperty.add(myOnlyPropertyItem);
    return this;
  }

  /**
   * Get myOnlyProperty
   * @return myOnlyProperty
  */
  @Valid 
  @JsonProperty("myOnlyProperty")
  public Set<BigDecimal> getMyOnlyProperty() {
    return myOnlyProperty;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setMyOnlyProperty(Set<BigDecimal> myOnlyProperty) {
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

