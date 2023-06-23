package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.Dummy200ResponseOuterProp;



public class Dummy200Response   {

    private Dummy200ResponseOuterProp outerProp;

    /**
     * Default constructor.
     */
    public Dummy200Response() {
    // JSON-B / Jackson
    }

    /**
     * Create Dummy200Response.
     *
     * @param outerProp outerProp
     */
    public Dummy200Response(
        Dummy200ResponseOuterProp outerProp
    ) {
        this.outerProp = outerProp;
    }



    /**
     * Get outerProp
     * @return outerProp
     */
    public Dummy200ResponseOuterProp getOuterProp() {
        return outerProp;
    }

    public void setOuterProp(Dummy200ResponseOuterProp outerProp) {
        this.outerProp = outerProp;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Dummy200Response {\n");
        
        sb.append("    outerProp: ").append(toIndentedString(outerProp)).append("\n");
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

