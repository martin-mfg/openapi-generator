package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class MapTest   {

    private java.util.Map<String, java.util.Map<String, String>> mapMapOfString = new java.util.HashMap<>();

    /**
    * Gets or Sets inner
    */
    public enum InnerEnum {
        UPPER("UPPER"),
        LOWER("lower");

        private String value;

        InnerEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static InnerEnum fromValue(String text) {
            for (InnerEnum b : InnerEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private java.util.Map<String, InnerEnum> mapOfEnumString = new java.util.HashMap<>();
    private java.util.Map<String, Boolean> directMap = new java.util.HashMap<>();
    private java.util.Map<String, Boolean> indirectMap = new java.util.HashMap<>();

    /**
     * Default constructor.
     */
    public MapTest() {
    // JSON-B / Jackson
    }

    /**
     * Create MapTest.
     *
     * @param mapMapOfString mapMapOfString
     * @param mapOfEnumString mapOfEnumString
     * @param directMap directMap
     * @param indirectMap indirectMap
     */
    public MapTest(
        java.util.Map<String, java.util.Map<String, String>> mapMapOfString, 
        java.util.Map<String, InnerEnum> mapOfEnumString, 
        java.util.Map<String, Boolean> directMap, 
        java.util.Map<String, Boolean> indirectMap
    ) {
        this.mapMapOfString = mapMapOfString;
        this.mapOfEnumString = mapOfEnumString;
        this.directMap = directMap;
        this.indirectMap = indirectMap;
    }



    /**
     * Get mapMapOfString
     * @return mapMapOfString
     */
    public java.util.Map<String, java.util.Map<String, String>> getMapMapOfString() {
        return mapMapOfString;
    }

    public void setMapMapOfString(java.util.Map<String, java.util.Map<String, String>> mapMapOfString) {
        this.mapMapOfString = mapMapOfString;
    }

    /**
     * Get mapOfEnumString
     * @return mapOfEnumString
     */
    public java.util.Map<String, InnerEnum> getMapOfEnumString() {
        return mapOfEnumString;
    }

    public void setMapOfEnumString(java.util.Map<String, InnerEnum> mapOfEnumString) {
        this.mapOfEnumString = mapOfEnumString;
    }

    /**
     * Get directMap
     * @return directMap
     */
    public java.util.Map<String, Boolean> getDirectMap() {
        return directMap;
    }

    public void setDirectMap(java.util.Map<String, Boolean> directMap) {
        this.directMap = directMap;
    }

    /**
     * Get indirectMap
     * @return indirectMap
     */
    public java.util.Map<String, Boolean> getIndirectMap() {
        return indirectMap;
    }

    public void setIndirectMap(java.util.Map<String, Boolean> indirectMap) {
        this.indirectMap = indirectMap;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MapTest {\n");
        
        sb.append("    mapMapOfString: ").append(toIndentedString(mapMapOfString)).append("\n");
        sb.append("    mapOfEnumString: ").append(toIndentedString(mapOfEnumString)).append("\n");
        sb.append("    directMap: ").append(toIndentedString(directMap)).append("\n");
        sb.append("    indirectMap: ").append(toIndentedString(indirectMap)).append("\n");
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

