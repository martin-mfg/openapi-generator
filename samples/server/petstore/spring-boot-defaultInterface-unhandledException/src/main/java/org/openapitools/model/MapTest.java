package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MapTest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class MapTest {

  @Valid
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
    public static InnerEnum fromValue(String value) {
      for (InnerEnum b : InnerEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private java.util.Map<String, InnerEnum> mapOfEnumString = new java.util.HashMap<>();

  @Valid
  private java.util.Map<String, Boolean> directMap = new java.util.HashMap<>();

  @Valid
  private java.util.Map<String, Boolean> indirectMap = new java.util.HashMap<>();

  public MapTest mapMapOfString(java.util.Map<String, java.util.Map<String, String>> mapMapOfString) {
    this.mapMapOfString = mapMapOfString;
    return this;
  }

  public MapTest putMapMapOfStringItem(String key, java.util.Map<String, String> mapMapOfStringItem) {
    if (this.mapMapOfString == null) {
      this.mapMapOfString = new java.util.HashMap<>();
    }
    this.mapMapOfString.put(key, mapMapOfStringItem);
    return this;
  }

  /**
   * Get mapMapOfString
   * @return mapMapOfString
  */
  @Valid 
  @Schema(name = "map_map_of_string", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("map_map_of_string")
  public java.util.Map<String, java.util.Map<String, String>> getMapMapOfString() {
    return mapMapOfString;
  }

  public void setMapMapOfString(java.util.Map<String, java.util.Map<String, String>> mapMapOfString) {
    this.mapMapOfString = mapMapOfString;
  }

  public MapTest mapOfEnumString(java.util.Map<String, InnerEnum> mapOfEnumString) {
    this.mapOfEnumString = mapOfEnumString;
    return this;
  }

  public MapTest putMapOfEnumStringItem(String key, InnerEnum mapOfEnumStringItem) {
    if (this.mapOfEnumString == null) {
      this.mapOfEnumString = new java.util.HashMap<>();
    }
    this.mapOfEnumString.put(key, mapOfEnumStringItem);
    return this;
  }

  /**
   * Get mapOfEnumString
   * @return mapOfEnumString
  */
  
  @Schema(name = "map_of_enum_string", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("map_of_enum_string")
  public java.util.Map<String, InnerEnum> getMapOfEnumString() {
    return mapOfEnumString;
  }

  public void setMapOfEnumString(java.util.Map<String, InnerEnum> mapOfEnumString) {
    this.mapOfEnumString = mapOfEnumString;
  }

  public MapTest directMap(java.util.Map<String, Boolean> directMap) {
    this.directMap = directMap;
    return this;
  }

  public MapTest putDirectMapItem(String key, Boolean directMapItem) {
    if (this.directMap == null) {
      this.directMap = new java.util.HashMap<>();
    }
    this.directMap.put(key, directMapItem);
    return this;
  }

  /**
   * Get directMap
   * @return directMap
  */
  
  @Schema(name = "direct_map", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("direct_map")
  public java.util.Map<String, Boolean> getDirectMap() {
    return directMap;
  }

  public void setDirectMap(java.util.Map<String, Boolean> directMap) {
    this.directMap = directMap;
  }

  public MapTest indirectMap(java.util.Map<String, Boolean> indirectMap) {
    this.indirectMap = indirectMap;
    return this;
  }

  public MapTest putIndirectMapItem(String key, Boolean indirectMapItem) {
    if (this.indirectMap == null) {
      this.indirectMap = new java.util.HashMap<>();
    }
    this.indirectMap.put(key, indirectMapItem);
    return this;
  }

  /**
   * Get indirectMap
   * @return indirectMap
  */
  
  @Schema(name = "indirect_map", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("indirect_map")
  public java.util.Map<String, Boolean> getIndirectMap() {
    return indirectMap;
  }

  public void setIndirectMap(java.util.Map<String, Boolean> indirectMap) {
    this.indirectMap = indirectMap;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MapTest mapTest = (MapTest) o;
    return Objects.equals(this.mapMapOfString, mapTest.mapMapOfString) &&
        Objects.equals(this.mapOfEnumString, mapTest.mapOfEnumString) &&
        Objects.equals(this.directMap, mapTest.directMap) &&
        Objects.equals(this.indirectMap, mapTest.indirectMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapMapOfString, mapOfEnumString, directMap, indirectMap);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

