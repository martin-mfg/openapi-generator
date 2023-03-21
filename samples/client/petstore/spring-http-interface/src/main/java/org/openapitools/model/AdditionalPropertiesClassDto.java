package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AdditionalPropertiesClassDto
 */

@JsonTypeName("AdditionalPropertiesClass")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdditionalPropertiesClassDto {

  
  private java.util.Map<String, String> mapString = new java.util.HashMap<>();

  
  private java.util.Map<String, BigDecimal> mapNumber = new java.util.HashMap<>();

  
  private java.util.Map<String, Integer> mapInteger = new java.util.HashMap<>();

  
  private java.util.Map<String, Boolean> mapBoolean = new java.util.HashMap<>();

  
  private java.util.Map<String, java.util.List<Integer>> mapArrayInteger = new java.util.HashMap<>();

  
  private java.util.Map<String, java.util.List<Object>> mapArrayAnytype = new java.util.HashMap<>();

  
  private java.util.Map<String, java.util.Map<String, String>> mapMapString = new java.util.HashMap<>();

  
  private java.util.Map<String, java.util.Map<String, Object>> mapMapAnytype = new java.util.HashMap<>();

  private Object anytype1;

  private JsonNullable<Object> anytype2 = JsonNullable.undefined();

  private Object anytype3;

  public AdditionalPropertiesClassDto mapString(java.util.Map<String, String> mapString) {
    this.mapString = mapString;
    return this;
  }

  public AdditionalPropertiesClassDto putMapStringItem(String key, String mapStringItem) {
    if (this.mapString == null) {
      this.mapString = new java.util.HashMap<>();
    }
    this.mapString.put(key, mapStringItem);
    return this;
  }

  /**
   * Get mapString
   * @return mapString
  */
  
  @JsonProperty("map_string")
  public java.util.Map<String, String> getMapString() {
    return mapString;
  }

  public void setMapString(java.util.Map<String, String> mapString) {
    this.mapString = mapString;
  }

  public AdditionalPropertiesClassDto mapNumber(java.util.Map<String, BigDecimal> mapNumber) {
    this.mapNumber = mapNumber;
    return this;
  }

  public AdditionalPropertiesClassDto putMapNumberItem(String key, BigDecimal mapNumberItem) {
    if (this.mapNumber == null) {
      this.mapNumber = new java.util.HashMap<>();
    }
    this.mapNumber.put(key, mapNumberItem);
    return this;
  }

  /**
   * Get mapNumber
   * @return mapNumber
  */
  
  @JsonProperty("map_number")
  public java.util.Map<String, BigDecimal> getMapNumber() {
    return mapNumber;
  }

  public void setMapNumber(java.util.Map<String, BigDecimal> mapNumber) {
    this.mapNumber = mapNumber;
  }

  public AdditionalPropertiesClassDto mapInteger(java.util.Map<String, Integer> mapInteger) {
    this.mapInteger = mapInteger;
    return this;
  }

  public AdditionalPropertiesClassDto putMapIntegerItem(String key, Integer mapIntegerItem) {
    if (this.mapInteger == null) {
      this.mapInteger = new java.util.HashMap<>();
    }
    this.mapInteger.put(key, mapIntegerItem);
    return this;
  }

  /**
   * Get mapInteger
   * @return mapInteger
  */
  
  @JsonProperty("map_integer")
  public java.util.Map<String, Integer> getMapInteger() {
    return mapInteger;
  }

  public void setMapInteger(java.util.Map<String, Integer> mapInteger) {
    this.mapInteger = mapInteger;
  }

  public AdditionalPropertiesClassDto mapBoolean(java.util.Map<String, Boolean> mapBoolean) {
    this.mapBoolean = mapBoolean;
    return this;
  }

  public AdditionalPropertiesClassDto putMapBooleanItem(String key, Boolean mapBooleanItem) {
    if (this.mapBoolean == null) {
      this.mapBoolean = new java.util.HashMap<>();
    }
    this.mapBoolean.put(key, mapBooleanItem);
    return this;
  }

  /**
   * Get mapBoolean
   * @return mapBoolean
  */
  
  @JsonProperty("map_boolean")
  public java.util.Map<String, Boolean> getMapBoolean() {
    return mapBoolean;
  }

  public void setMapBoolean(java.util.Map<String, Boolean> mapBoolean) {
    this.mapBoolean = mapBoolean;
  }

  public AdditionalPropertiesClassDto mapArrayInteger(java.util.Map<String, java.util.List<Integer>> mapArrayInteger) {
    this.mapArrayInteger = mapArrayInteger;
    return this;
  }

  public AdditionalPropertiesClassDto putMapArrayIntegerItem(String key, java.util.List<Integer> mapArrayIntegerItem) {
    if (this.mapArrayInteger == null) {
      this.mapArrayInteger = new java.util.HashMap<>();
    }
    this.mapArrayInteger.put(key, mapArrayIntegerItem);
    return this;
  }

  /**
   * Get mapArrayInteger
   * @return mapArrayInteger
  */
  
  @JsonProperty("map_array_integer")
  public java.util.Map<String, java.util.List<Integer>> getMapArrayInteger() {
    return mapArrayInteger;
  }

  public void setMapArrayInteger(java.util.Map<String, java.util.List<Integer>> mapArrayInteger) {
    this.mapArrayInteger = mapArrayInteger;
  }

  public AdditionalPropertiesClassDto mapArrayAnytype(java.util.Map<String, java.util.List<Object>> mapArrayAnytype) {
    this.mapArrayAnytype = mapArrayAnytype;
    return this;
  }

  public AdditionalPropertiesClassDto putMapArrayAnytypeItem(String key, java.util.List<Object> mapArrayAnytypeItem) {
    if (this.mapArrayAnytype == null) {
      this.mapArrayAnytype = new java.util.HashMap<>();
    }
    this.mapArrayAnytype.put(key, mapArrayAnytypeItem);
    return this;
  }

  /**
   * Get mapArrayAnytype
   * @return mapArrayAnytype
  */
  
  @JsonProperty("map_array_anytype")
  public java.util.Map<String, java.util.List<Object>> getMapArrayAnytype() {
    return mapArrayAnytype;
  }

  public void setMapArrayAnytype(java.util.Map<String, java.util.List<Object>> mapArrayAnytype) {
    this.mapArrayAnytype = mapArrayAnytype;
  }

  public AdditionalPropertiesClassDto mapMapString(java.util.Map<String, java.util.Map<String, String>> mapMapString) {
    this.mapMapString = mapMapString;
    return this;
  }

  public AdditionalPropertiesClassDto putMapMapStringItem(String key, java.util.Map<String, String> mapMapStringItem) {
    if (this.mapMapString == null) {
      this.mapMapString = new java.util.HashMap<>();
    }
    this.mapMapString.put(key, mapMapStringItem);
    return this;
  }

  /**
   * Get mapMapString
   * @return mapMapString
  */
  
  @JsonProperty("map_map_string")
  public java.util.Map<String, java.util.Map<String, String>> getMapMapString() {
    return mapMapString;
  }

  public void setMapMapString(java.util.Map<String, java.util.Map<String, String>> mapMapString) {
    this.mapMapString = mapMapString;
  }

  public AdditionalPropertiesClassDto mapMapAnytype(java.util.Map<String, java.util.Map<String, Object>> mapMapAnytype) {
    this.mapMapAnytype = mapMapAnytype;
    return this;
  }

  public AdditionalPropertiesClassDto putMapMapAnytypeItem(String key, java.util.Map<String, Object> mapMapAnytypeItem) {
    if (this.mapMapAnytype == null) {
      this.mapMapAnytype = new java.util.HashMap<>();
    }
    this.mapMapAnytype.put(key, mapMapAnytypeItem);
    return this;
  }

  /**
   * Get mapMapAnytype
   * @return mapMapAnytype
  */
  
  @JsonProperty("map_map_anytype")
  public java.util.Map<String, java.util.Map<String, Object>> getMapMapAnytype() {
    return mapMapAnytype;
  }

  public void setMapMapAnytype(java.util.Map<String, java.util.Map<String, Object>> mapMapAnytype) {
    this.mapMapAnytype = mapMapAnytype;
  }

  public AdditionalPropertiesClassDto anytype1(Object anytype1) {
    this.anytype1 = anytype1;
    return this;
  }

  /**
   * Get anytype1
   * @return anytype1
  */
  
  @JsonProperty("anytype_1")
  public Object getAnytype1() {
    return anytype1;
  }

  public void setAnytype1(Object anytype1) {
    this.anytype1 = anytype1;
  }

  public AdditionalPropertiesClassDto anytype2(Object anytype2) {
    this.anytype2 = JsonNullable.of(anytype2);
    return this;
  }

  /**
   * Get anytype2
   * @return anytype2
  */
  
  @JsonProperty("anytype_2")
  public JsonNullable<Object> getAnytype2() {
    return anytype2;
  }

  public void setAnytype2(JsonNullable<Object> anytype2) {
    this.anytype2 = anytype2;
  }

  public AdditionalPropertiesClassDto anytype3(Object anytype3) {
    this.anytype3 = anytype3;
    return this;
  }

  /**
   * Get anytype3
   * @return anytype3
  */
  
  @JsonProperty("anytype_3")
  public Object getAnytype3() {
    return anytype3;
  }

  public void setAnytype3(Object anytype3) {
    this.anytype3 = anytype3;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalPropertiesClassDto additionalPropertiesClass = (AdditionalPropertiesClassDto) o;
    return Objects.equals(this.mapString, additionalPropertiesClass.mapString) &&
        Objects.equals(this.mapNumber, additionalPropertiesClass.mapNumber) &&
        Objects.equals(this.mapInteger, additionalPropertiesClass.mapInteger) &&
        Objects.equals(this.mapBoolean, additionalPropertiesClass.mapBoolean) &&
        Objects.equals(this.mapArrayInteger, additionalPropertiesClass.mapArrayInteger) &&
        Objects.equals(this.mapArrayAnytype, additionalPropertiesClass.mapArrayAnytype) &&
        Objects.equals(this.mapMapString, additionalPropertiesClass.mapMapString) &&
        Objects.equals(this.mapMapAnytype, additionalPropertiesClass.mapMapAnytype) &&
        Objects.equals(this.anytype1, additionalPropertiesClass.anytype1) &&
        equalsNullable(this.anytype2, additionalPropertiesClass.anytype2) &&
        Objects.equals(this.anytype3, additionalPropertiesClass.anytype3);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapString, mapNumber, mapInteger, mapBoolean, mapArrayInteger, mapArrayAnytype, mapMapString, mapMapAnytype, anytype1, hashCodeNullable(anytype2), anytype3);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalPropertiesClassDto {\n");
    sb.append("    mapString: ").append(toIndentedString(mapString)).append("\n");
    sb.append("    mapNumber: ").append(toIndentedString(mapNumber)).append("\n");
    sb.append("    mapInteger: ").append(toIndentedString(mapInteger)).append("\n");
    sb.append("    mapBoolean: ").append(toIndentedString(mapBoolean)).append("\n");
    sb.append("    mapArrayInteger: ").append(toIndentedString(mapArrayInteger)).append("\n");
    sb.append("    mapArrayAnytype: ").append(toIndentedString(mapArrayAnytype)).append("\n");
    sb.append("    mapMapString: ").append(toIndentedString(mapMapString)).append("\n");
    sb.append("    mapMapAnytype: ").append(toIndentedString(mapMapAnytype)).append("\n");
    sb.append("    anytype1: ").append(toIndentedString(anytype1)).append("\n");
    sb.append("    anytype2: ").append(toIndentedString(anytype2)).append("\n");
    sb.append("    anytype3: ").append(toIndentedString(anytype3)).append("\n");
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

