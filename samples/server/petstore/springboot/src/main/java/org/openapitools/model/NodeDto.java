package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * dummy
 */

@ApiModel(description = "dummy")
@JsonTypeName("Node")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class NodeDto {

  private NodeDto left;

  private NodeDto right;

  public NodeDto left(NodeDto left) {
    this.left = left;
    return this;
  }

  /**
   * Get left
   * @return left
  */
  @Valid 
  @ApiModelProperty(value = "")
  @JsonProperty("left")
  public NodeDto getLeft() {
    return left;
  }

  public void setLeft(NodeDto left) {
    this.left = left;
  }

  public NodeDto right(NodeDto right) {
    this.right = right;
    return this;
  }

  /**
   * Get right
   * @return right
  */
  @Valid 
  @ApiModelProperty(value = "")
  @JsonProperty("right")
  public NodeDto getRight() {
    return right;
  }

  public void setRight(NodeDto right) {
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
    NodeDto node = (NodeDto) o;
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
    sb.append("class NodeDto {\n");
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

