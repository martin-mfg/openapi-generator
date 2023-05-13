package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.Foo;



public class FooGetDefaultResponse   {

    private Foo myString;

    /**
     * Default constructor.
     */
    public FooGetDefaultResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create FooGetDefaultResponse.
     *
     * @param myString myString
     */
    public FooGetDefaultResponse(
        Foo myString
    ) {
        this.myString = myString;
    }



    /**
     * Get myString
     * @return myString
     */
    public Foo getMyString() {
        return myString;
    }

    public void setMyString(Foo myString) {
        this.myString = myString;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FooGetDefaultResponse {\n");
        
        sb.append("    myString: ").append(toIndentedString(myString)).append("\n");
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

