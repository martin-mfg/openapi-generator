package org.openapitools.server.model;




public class AdditionalPropertiesClass   {

    private java.util.Map<String, String> mapProperty = new java.util.HashMap<>();
    private java.util.Map<String, java.util.Map<String, String>> mapOfMapProperty = new java.util.HashMap<>();

    /**
     * Default constructor.
     */
    public AdditionalPropertiesClass() {
    // JSON-B / Jackson
    }

    /**
     * Create AdditionalPropertiesClass.
     *
     * @param mapProperty mapProperty
     * @param mapOfMapProperty mapOfMapProperty
     */
    public AdditionalPropertiesClass(
        java.util.Map<String, String> mapProperty, 
        java.util.Map<String, java.util.Map<String, String>> mapOfMapProperty
    ) {
        this.mapProperty = mapProperty;
        this.mapOfMapProperty = mapOfMapProperty;
    }



    /**
     * Get mapProperty
     * @return mapProperty
     */
    public java.util.Map<String, String> getMapProperty() {
        return mapProperty;
    }

    public void setMapProperty(java.util.Map<String, String> mapProperty) {
        this.mapProperty = mapProperty;
    }

    /**
     * Get mapOfMapProperty
     * @return mapOfMapProperty
     */
    public java.util.Map<String, java.util.Map<String, String>> getMapOfMapProperty() {
        return mapOfMapProperty;
    }

    public void setMapOfMapProperty(java.util.Map<String, java.util.Map<String, String>> mapOfMapProperty) {
        this.mapOfMapProperty = mapOfMapProperty;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdditionalPropertiesClass {\n");
        
        sb.append("    mapProperty: ").append(toIndentedString(mapProperty)).append("\n");
        sb.append("    mapOfMapProperty: ").append(toIndentedString(mapOfMapProperty)).append("\n");
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

