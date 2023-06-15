package apimodels;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ExampleResponse   {
  @JsonProperty("myOnlyProperty")
  
  private List<Boolean> myOnlyProperty = null;

  public ExampleResponse myOnlyProperty(List<Boolean> myOnlyProperty) {
    this.myOnlyProperty = myOnlyProperty;
    return this;
  }

  public ExampleResponse addMyOnlyPropertyItem(Boolean myOnlyPropertyItem) {
    if (this.myOnlyProperty == null) {
      this.myOnlyProperty = new ArrayList<>();
    }
    this.myOnlyProperty.add(myOnlyPropertyItem);
    return this;
  }

   /**
   * Get myOnlyProperty
   * @return myOnlyProperty
  **/
  public List<Boolean> getMyOnlyProperty() {
    return myOnlyProperty;
  }

  public void setMyOnlyProperty(List<Boolean> myOnlyProperty) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

