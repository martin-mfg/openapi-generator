package org.openapitools.server.model;

import org.openapitools.server.model.ReadOnlyFirst;



public class ArrayTest   {

    private java.util.List<String> arrayOfString;
    private java.util.List<java.util.List<Long>> arrayArrayOfInteger;
    private java.util.List<java.util.List<ReadOnlyFirst>> arrayArrayOfModel;

    /**
     * Default constructor.
     */
    public ArrayTest() {
    // JSON-B / Jackson
    }

    /**
     * Create ArrayTest.
     *
     * @param arrayOfString arrayOfString
     * @param arrayArrayOfInteger arrayArrayOfInteger
     * @param arrayArrayOfModel arrayArrayOfModel
     */
    public ArrayTest(
        java.util.List<String> arrayOfString, 
        java.util.List<java.util.List<Long>> arrayArrayOfInteger, 
        java.util.List<java.util.List<ReadOnlyFirst>> arrayArrayOfModel
    ) {
        this.arrayOfString = arrayOfString;
        this.arrayArrayOfInteger = arrayArrayOfInteger;
        this.arrayArrayOfModel = arrayArrayOfModel;
    }



    /**
     * Get arrayOfString
     * @return arrayOfString
     */
    public java.util.List<String> getArrayOfString() {
        return arrayOfString;
    }

    public void setArrayOfString(java.util.List<String> arrayOfString) {
        this.arrayOfString = arrayOfString;
    }

    /**
     * Get arrayArrayOfInteger
     * @return arrayArrayOfInteger
     */
    public java.util.List<java.util.List<Long>> getArrayArrayOfInteger() {
        return arrayArrayOfInteger;
    }

    public void setArrayArrayOfInteger(java.util.List<java.util.List<Long>> arrayArrayOfInteger) {
        this.arrayArrayOfInteger = arrayArrayOfInteger;
    }

    /**
     * Get arrayArrayOfModel
     * @return arrayArrayOfModel
     */
    public java.util.List<java.util.List<ReadOnlyFirst>> getArrayArrayOfModel() {
        return arrayArrayOfModel;
    }

    public void setArrayArrayOfModel(java.util.List<java.util.List<ReadOnlyFirst>> arrayArrayOfModel) {
        this.arrayArrayOfModel = arrayArrayOfModel;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArrayTest {\n");
        
        sb.append("    arrayOfString: ").append(toIndentedString(arrayOfString)).append("\n");
        sb.append("    arrayArrayOfInteger: ").append(toIndentedString(arrayArrayOfInteger)).append("\n");
        sb.append("    arrayArrayOfModel: ").append(toIndentedString(arrayArrayOfModel)).append("\n");
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

