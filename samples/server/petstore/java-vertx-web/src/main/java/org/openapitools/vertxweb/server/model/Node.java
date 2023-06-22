package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * dummy
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Node   {
  
  private Node left;
  private Node right;

  public Node () {

  }

  public Node (Node left, Node right) {
    this.left = left;
    this.right = right;
  }

    
  @JsonProperty("left")
  public Node getLeft() {
    return left;
  }
  public void setLeft(Node left) {
    this.left = left;
  }

    
  @JsonProperty("right")
  public Node getRight() {
    return right;
  }
  public void setRight(Node right) {
    this.right = right;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Node node = (Node) o;
    return Objects.equals(left, node.left) &&
        Objects.equals(right, node.right);
  }

  @Override
  public int hashCode() {
    return Objects.hash(left, right);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
