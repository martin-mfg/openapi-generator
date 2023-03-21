package org.openapitools.server.model;

import java.math.BigDecimal;



public class ArrayOfNumberOnly   {

    private java.util.List<BigDecimal> arrayNumber;

    /**
     * Default constructor.
     */
    public ArrayOfNumberOnly() {
    // JSON-B / Jackson
    }

    /**
     * Create ArrayOfNumberOnly.
     *
     * @param arrayNumber arrayNumber
     */
    public ArrayOfNumberOnly(
        java.util.List<BigDecimal> arrayNumber
    ) {
        this.arrayNumber = arrayNumber;
    }



    /**
     * Get arrayNumber
     * @return arrayNumber
     */
    public java.util.List<BigDecimal> getArrayNumber() {
        return arrayNumber;
    }

    public void setArrayNumber(java.util.List<BigDecimal> arrayNumber) {
        this.arrayNumber = arrayNumber;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArrayOfNumberOnly {\n");
        
        sb.append("    arrayNumber: ").append(toIndentedString(arrayNumber)).append("\n");
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

