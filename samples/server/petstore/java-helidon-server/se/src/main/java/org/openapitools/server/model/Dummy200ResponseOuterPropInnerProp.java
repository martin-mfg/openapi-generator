package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;



public class Dummy200ResponseOuterPropInnerProp   {

    private Boolean myBool;

    /**
     * Default constructor.
     */
    public Dummy200ResponseOuterPropInnerProp() {
    // JSON-B / Jackson
    }

    /**
     * Create Dummy200ResponseOuterPropInnerProp.
     *
     * @param myBool myBool
     */
    public Dummy200ResponseOuterPropInnerProp(
        Boolean myBool
    ) {
        this.myBool = myBool;
    }



    /**
     * Get myBool
     * @return myBool
     */
    public Boolean getMyBool() {
        return myBool;
    }

    public void setMyBool(Boolean myBool) {
        this.myBool = myBool;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Dummy200ResponseOuterPropInnerProp {\n");
        
        sb.append("    myBool: ").append(toIndentedString(myBool)).append("\n");
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

