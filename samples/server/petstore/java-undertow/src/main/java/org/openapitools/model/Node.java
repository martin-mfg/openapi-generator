/*
 * dummy
 *
 * dummy
 *
 * OpenAPI document version: dummy
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * dummy
 */

@ApiModel(description = "dummy")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen")
public class Node   {
  
  private Node left;
  private Node right;

  /**
   */
  public Node left(Node left) {
    this.left = left;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("left")
  public Node getLeft() {
    return left;
  }
  public void setLeft(Node left) {
    this.left = left;
  }

  /**
   */
  public Node right(Node right) {
    this.right = right;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

