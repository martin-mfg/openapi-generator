package org.openapitools.server.model;



/**
 * dummy
 */
public class ExampleResponse   {

    private String emptyString = "";
    private String numberString = "42";
    private String boolString = "false";
    private String nullString = "null";
    private Boolean aBool = false;
    private Integer zero = 0;

    /**
     * Default constructor.
     */
    public ExampleResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create ExampleResponse.
     *
     * @param emptyString emptyString
     * @param numberString numberString
     * @param boolString boolString
     * @param nullString nullString
     * @param aBool aBool
     * @param zero zero
     */
    public ExampleResponse(
        String emptyString, 
        String numberString, 
        String boolString, 
        String nullString, 
        Boolean aBool, 
        Integer zero
    ) {
        this.emptyString = emptyString;
        this.numberString = numberString;
        this.boolString = boolString;
        this.nullString = nullString;
        this.aBool = aBool;
        this.zero = zero;
    }



    /**
     * Get emptyString
     * @return emptyString
     */
    public String getEmptyString() {
        return emptyString;
    }

    public void setEmptyString(String emptyString) {
        this.emptyString = emptyString;
    }

    /**
     * Get numberString
     * @return numberString
     */
    public String getNumberString() {
        return numberString;
    }

    public void setNumberString(String numberString) {
        this.numberString = numberString;
    }

    /**
     * Get boolString
     * @return boolString
     */
    public String getBoolString() {
        return boolString;
    }

    public void setBoolString(String boolString) {
        this.boolString = boolString;
    }

    /**
     * Get nullString
     * @return nullString
     */
    public String getNullString() {
        return nullString;
    }

    public void setNullString(String nullString) {
        this.nullString = nullString;
    }

    /**
     * Get aBool
     * @return aBool
     */
    public Boolean getaBool() {
        return aBool;
    }

    public void setaBool(Boolean aBool) {
        this.aBool = aBool;
    }

    /**
     * Get zero
     * @return zero
     */
    public Integer getZero() {
        return zero;
    }

    public void setZero(Integer zero) {
        this.zero = zero;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExampleResponse {\n");
        
        sb.append("    emptyString: ").append(toIndentedString(emptyString)).append("\n");
        sb.append("    numberString: ").append(toIndentedString(numberString)).append("\n");
        sb.append("    boolString: ").append(toIndentedString(boolString)).append("\n");
        sb.append("    nullString: ").append(toIndentedString(nullString)).append("\n");
        sb.append("    aBool: ").append(toIndentedString(aBool)).append("\n");
        sb.append("    zero: ").append(toIndentedString(zero)).append("\n");
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

