package org.openapitools.server.model;




public class Baz   {

    private String innerBaz = "defaultBaz";

    /**
     * Default constructor.
     */
    public Baz() {
    // JSON-B / Jackson
    }

    /**
     * Create Baz.
     *
     * @param innerBaz innerBaz
     */
    public Baz(
        String innerBaz
    ) {
        this.innerBaz = innerBaz;
    }



    /**
     * Get innerBaz
     * @return innerBaz
     */
    public String getInnerBaz() {
        return innerBaz;
    }

    public void setInnerBaz(String innerBaz) {
        this.innerBaz = innerBaz;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Baz {\n");
        
        sb.append("    innerBaz: ").append(toIndentedString(innerBaz)).append("\n");
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

