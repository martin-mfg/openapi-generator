package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.Dummy200ResponseOuterPropInnerProp;



public class Dummy200ResponseOuterProp   {

    private Dummy200ResponseOuterPropInnerProp innerProp;

    /**
     * Default constructor.
     */
    public Dummy200ResponseOuterProp() {
    // JSON-B / Jackson
    }

    /**
     * Create Dummy200ResponseOuterProp.
     *
     * @param innerProp innerProp
     */
    public Dummy200ResponseOuterProp(
        Dummy200ResponseOuterPropInnerProp innerProp
    ) {
        this.innerProp = innerProp;
    }



    /**
     * Get innerProp
     * @return innerProp
     */
    public Dummy200ResponseOuterPropInnerProp getInnerProp() {
        return innerProp;
    }

    public void setInnerProp(Dummy200ResponseOuterPropInnerProp innerProp) {
        this.innerProp = innerProp;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

