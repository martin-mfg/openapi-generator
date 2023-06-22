package org.openapitools.server.model;

import org.openapitools.server.model.ExampleResponse;


/**
 * dummy
 */
public class OtherObject   {

    private ExampleResponse myOnlyProperty2;

    /**
     * Default constructor.
     */
    public OtherObject() {
    // JSON-B / Jackson
    }

    /**
     * Create OtherObject.
     *
     * @param myOnlyProperty2 myOnlyProperty2
     */
    public OtherObject(
        ExampleResponse myOnlyProperty2
    ) {
        this.myOnlyProperty2 = myOnlyProperty2;
    }



    /**
     * Get myOnlyProperty2
     * @return myOnlyProperty2
     */
    public ExampleResponse getMyOnlyProperty2() {
        return myOnlyProperty2;
    }

    public void setMyOnlyProperty2(ExampleResponse myOnlyProperty2) {
        this.myOnlyProperty2 = myOnlyProperty2;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

