package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.xml.bind.annotation.*;

import java.util.*;
import javax.annotation.Generated;

/**
 * dummy
 */

@Schema(name = "Node", description = "dummy")
@JacksonXmlRootElement(localName = "Node")
@XmlRootElement(name = "Node")
@XmlAccessorType(XmlAccessType.FIELD)

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen")
public class Node {

  @JacksonXmlProperty(localName = "left")
  private Node left;

  @JacksonXmlProperty(localName = "right")
  private Node right;

  public Node left(Node left) {
    this.left = left;
    return this;
  }

  /**
   * Get left
   * @return left
  */
  @Valid 
  @Schema(name = "left", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("left")
  public Node getLeft() {
    return left;
  }

  public void setLeft(Node left) {
    this.left = left;
  }

  public Node right(Node right) {
    this.right = right;
    return this;
  }

  /**
   * Get right
   * @return right
  */
  @Valid 
  @Schema(name = "right", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
}

