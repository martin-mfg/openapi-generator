package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * dummy
 **/
@ApiModel(description = "dummy")
@JsonTypeName("Node")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class Node  implements Serializable {
  private @Valid Node left;
  private @Valid Node right;

  protected Node(NodeBuilder<?, ?> b) {
    this.left = b.left;
    this.right = b.right;
  }

  public Node() {
  }

  /**
   **/
  public Node left(Node left) {
    this.left = left;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("left")
  public Node getLeft() {
    return left;
  }

  @JsonProperty("left")
  public void setLeft(Node left) {
    this.left = left;
  }

  /**
   **/
  public Node right(Node right) {
    this.right = right;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("right")
  public Node getRight() {
    return right;
  }

  @JsonProperty("right")
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
    return Objects.equals(this.left, node.left) &&
        Objects.equals(this.right, node.right);
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


  public static NodeBuilder<?, ?> builder() {
    return new NodeBuilderImpl();
  }

  private static final class NodeBuilderImpl extends NodeBuilder<Node, NodeBuilderImpl> {

    @Override
    protected NodeBuilderImpl self() {
      return this;
    }

    @Override
    public Node build() {
      return new Node(this);
    }
  }

  public static abstract class NodeBuilder<C extends Node, B extends NodeBuilder<C, B>>  {
    private Node left;
    private Node right;
    protected abstract B self();

    public abstract C build();

    public B left(Node left) {
      this.left = left;
      return self();
    }
    public B right(Node right) {
      this.right = right;
      return self();
    }
  }
}

