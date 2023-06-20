package org.openapitools.server.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;


/**
 * dummy
 */
public class ExampleResponse   {

    private Set<BigDecimal> myOnlyProperty;

    /**
     * Default constructor.
     */
    public ExampleResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create ExampleResponse.
     *
     * @param myOnlyProperty myOnlyProperty
     */
    public ExampleResponse(
        Set<BigDecimal> myOnlyProperty
    ) {
        this.myOnlyProperty = myOnlyProperty;
    }



    /**
     * Get myOnlyProperty
     * @return myOnlyProperty
     */
    public Set<BigDecimal> getMyOnlyProperty() {
        return myOnlyProperty;
    }

    public void setMyOnlyProperty(Set<BigDecimal> myOnlyProperty) {
        this.myOnlyProperty = myOnlyProperty;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

