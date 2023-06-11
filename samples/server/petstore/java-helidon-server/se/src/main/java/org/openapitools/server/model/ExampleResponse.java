package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.List;



public class ExampleResponse   {

    private List<Boolean> myOnlyProperty;

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
        List<Boolean> myOnlyProperty
    ) {
        this.myOnlyProperty = myOnlyProperty;
    }



    /**
     * Get myOnlyProperty
     * @return myOnlyProperty
     */
    public List<Boolean> getMyOnlyProperty() {
        return myOnlyProperty;
    }

    public void setMyOnlyProperty(List<Boolean> myOnlyProperty) {
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

