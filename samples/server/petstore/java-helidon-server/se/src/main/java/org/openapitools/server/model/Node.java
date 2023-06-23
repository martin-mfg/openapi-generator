package org.openapitools.server.model;



/**
 * dummy
 */
public class Node   {

    private Node left;
    private Node right;

    /**
     * Default constructor.
     */
    public Node() {
    // JSON-B / Jackson
    }

    /**
     * Create Node.
     *
     * @param left left
     * @param right right
     */
    public Node(
        Node left, 
        Node right
    ) {
        this.left = left;
        this.right = right;
    }



    /**
     * Get left
     * @return left
     */
    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    /**
     * Get right
     * @return right
     */
    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Node {\n");
        
        sb.append("    left: ").append(toIndentedString(left)).append("\n");
        sb.append("    right: ").append(toIndentedString(right)).append("\n");
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

