package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * dummy
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExampleResponse   {
  
  private Set<BigDecimal> myOnlyProperty;

  public ExampleResponse () {

  }

  public ExampleResponse (Set<BigDecimal> myOnlyProperty) {
    this.myOnlyProperty = myOnlyProperty;
  }

    
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
