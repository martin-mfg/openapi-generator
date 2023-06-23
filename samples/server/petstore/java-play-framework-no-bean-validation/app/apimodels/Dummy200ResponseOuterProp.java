package apimodels;

import apimodels.Dummy200ResponseOuterPropInnerProp;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
/**
 * Dummy200ResponseOuterProp
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Dummy200ResponseOuterProp   {
  @JsonProperty("innerProp")
  private Dummy200ResponseOuterPropInnerProp innerProp;

  public Dummy200ResponseOuterProp innerProp(Dummy200ResponseOuterPropInnerProp innerProp) {
    this.innerProp = innerProp;
    return this;
  }

   /**
   * Get innerProp
   * @return innerProp
  **/
  public Dummy200ResponseOuterPropInnerProp getInnerProp() {
    return innerProp;
  }

  public void setInnerProp(Dummy200ResponseOuterPropInnerProp innerProp) {
    this.innerProp = innerProp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dummy200ResponseOuterProp dummy200ResponseOuterProp = (Dummy200ResponseOuterProp) o;
    return Objects.equals(innerProp, dummy200ResponseOuterProp.innerProp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(innerProp);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dummy200ResponseOuterProp {\n");
    
    sb.append("    innerProp: ").append(toIndentedString(innerProp)).append("\n");
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

