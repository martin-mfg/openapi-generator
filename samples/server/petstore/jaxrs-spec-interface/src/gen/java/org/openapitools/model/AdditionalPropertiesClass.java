package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("AdditionalPropertiesClass")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class AdditionalPropertiesClass  implements Serializable {
  private @Valid java.util.Map<String, String> mapString = new java.util.HashMap<>();
  private @Valid java.util.Map<String, BigDecimal> mapNumber = new java.util.HashMap<>();
  private @Valid java.util.Map<String, Integer> mapInteger = new java.util.HashMap<>();
  private @Valid java.util.Map<String, Boolean> mapBoolean = new java.util.HashMap<>();
  private @Valid java.util.Map<String, java.util.List<Integer>> mapArrayInteger = new java.util.HashMap<>();
  private @Valid java.util.Map<String, java.util.List<Object>> mapArrayAnytype = new java.util.HashMap<>();
  private @Valid java.util.Map<String, java.util.Map<String, String>> mapMapString = new java.util.HashMap<>();
  private @Valid java.util.Map<String, java.util.Map<String, Object>> mapMapAnytype = new java.util.HashMap<>();
  private @Valid Object anytype1;
  private @Valid Object anytype2;
  private @Valid Object anytype3;

  /**
   **/
  public AdditionalPropertiesClass mapString(java.util.Map<String, String> mapString) {
    this.mapString = mapString;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("map_string")
  public java.util.Map<String, String> getMapString() {
    return mapString;
  }

  @JsonProperty("map_string")
  public void setMapString(java.util.Map<String, String> mapString) {
    this.mapString = mapString;
  }

  public AdditionalPropertiesClass putMapStringItem(String key, String mapStringItem) {
    if (this.mapString == null) {
      this.mapString = new java.util.HashMap<>();
    }

    this.mapString.put(key, mapStringItem);
    return this;
  }

  public AdditionalPropertiesClass removeMapStringItem(String mapStringItem) {
    if (mapStringItem != null && this.mapString != null) {
      this.mapString.remove(mapStringItem);
    }

    return this;
  }
  /**
   **/
  public AdditionalPropertiesClass mapNumber(java.util.Map<String, BigDecimal> mapNumber) {
    this.mapNumber = mapNumber;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("map_number")
  public java.util.Map<String, BigDecimal> getMapNumber() {
    return mapNumber;
  }

  @JsonProperty("map_number")
  public void setMapNumber(java.util.Map<String, BigDecimal> mapNumber) {
    this.mapNumber = mapNumber;
  }

  public AdditionalPropertiesClass putMapNumberItem(String key, BigDecimal mapNumberItem) {
    if (this.mapNumber == null) {
      this.mapNumber = new java.util.HashMap<>();
    }

    this.mapNumber.put(key, mapNumberItem);
    return this;
  }

  public AdditionalPropertiesClass removeMapNumberItem(BigDecimal mapNumberItem) {
    if (mapNumberItem != null && this.mapNumber != null) {
      this.mapNumber.remove(mapNumberItem);
    }

    return this;
  }
  /**
   **/
  public AdditionalPropertiesClass mapInteger(java.util.Map<String, Integer> mapInteger) {
    this.mapInteger = mapInteger;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("map_integer")
  public java.util.Map<String, Integer> getMapInteger() {
    return mapInteger;
  }

  @JsonProperty("map_integer")
  public void setMapInteger(java.util.Map<String, Integer> mapInteger) {
    this.mapInteger = mapInteger;
  }

  public AdditionalPropertiesClass putMapIntegerItem(String key, Integer mapIntegerItem) {
    if (this.mapInteger == null) {
      this.mapInteger = new java.util.HashMap<>();
    }

    this.mapInteger.put(key, mapIntegerItem);
    return this;
  }

  public AdditionalPropertiesClass removeMapIntegerItem(Integer mapIntegerItem) {
    if (mapIntegerItem != null && this.mapInteger != null) {
      this.mapInteger.remove(mapIntegerItem);
    }

    return this;
  }
  /**
   **/
  public AdditionalPropertiesClass mapBoolean(java.util.Map<String, Boolean> mapBoolean) {
    this.mapBoolean = mapBoolean;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("map_boolean")
  public java.util.Map<String, Boolean> getMapBoolean() {
    return mapBoolean;
  }

  @JsonProperty("map_boolean")
  public void setMapBoolean(java.util.Map<String, Boolean> mapBoolean) {
    this.mapBoolean = mapBoolean;
  }

  public AdditionalPropertiesClass putMapBooleanItem(String key, Boolean mapBooleanItem) {
    if (this.mapBoolean == null) {
      this.mapBoolean = new java.util.HashMap<>();
    }

    this.mapBoolean.put(key, mapBooleanItem);
    return this;
  }

  public AdditionalPropertiesClass removeMapBooleanItem(Boolean mapBooleanItem) {
    if (mapBooleanItem != null && this.mapBoolean != null) {
      this.mapBoolean.remove(mapBooleanItem);
    }

    return this;
  }
  /**
   **/
  public AdditionalPropertiesClass mapArrayInteger(java.util.Map<String, java.util.List<Integer>> mapArrayInteger) {
    this.mapArrayInteger = mapArrayInteger;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("map_array_integer")
  public java.util.Map<String, java.util.List<Integer>> getMapArrayInteger() {
    return mapArrayInteger;
  }

  @JsonProperty("map_array_integer")
  public void setMapArrayInteger(java.util.Map<String, java.util.List<Integer>> mapArrayInteger) {
    this.mapArrayInteger = mapArrayInteger;
  }

  public AdditionalPropertiesClass putMapArrayIntegerItem(String key, java.util.List<Integer> mapArrayIntegerItem) {
    if (this.mapArrayInteger == null) {
      this.mapArrayInteger = new java.util.HashMap<>();
    }

    this.mapArrayInteger.put(key, mapArrayIntegerItem);
    return this;
  }

  public AdditionalPropertiesClass removeMapArrayIntegerItem(java.util.List<Integer> mapArrayIntegerItem) {
    if (mapArrayIntegerItem != null && this.mapArrayInteger != null) {
      this.mapArrayInteger.remove(mapArrayIntegerItem);
    }

    return this;
  }
  /**
   **/
  public AdditionalPropertiesClass mapArrayAnytype(java.util.Map<String, java.util.List<Object>> mapArrayAnytype) {
    this.mapArrayAnytype = mapArrayAnytype;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("map_array_anytype")
  public java.util.Map<String, java.util.List<Object>> getMapArrayAnytype() {
    return mapArrayAnytype;
  }

  @JsonProperty("map_array_anytype")
  public void setMapArrayAnytype(java.util.Map<String, java.util.List<Object>> mapArrayAnytype) {
    this.mapArrayAnytype = mapArrayAnytype;
  }

  public AdditionalPropertiesClass putMapArrayAnytypeItem(String key, java.util.List<Object> mapArrayAnytypeItem) {
    if (this.mapArrayAnytype == null) {
      this.mapArrayAnytype = new java.util.HashMap<>();
    }

    this.mapArrayAnytype.put(key, mapArrayAnytypeItem);
    return this;
  }

  public AdditionalPropertiesClass removeMapArrayAnytypeItem(java.util.List<Object> mapArrayAnytypeItem) {
    if (mapArrayAnytypeItem != null && this.mapArrayAnytype != null) {
      this.mapArrayAnytype.remove(mapArrayAnytypeItem);
    }

    return this;
  }
  /**
   **/
  public AdditionalPropertiesClass mapMapString(java.util.Map<String, java.util.Map<String, String>> mapMapString) {
    this.mapMapString = mapMapString;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("map_map_string")
  public java.util.Map<String, java.util.Map<String, String>> getMapMapString() {
    return mapMapString;
  }

  @JsonProperty("map_map_string")
  public void setMapMapString(java.util.Map<String, java.util.Map<String, String>> mapMapString) {
    this.mapMapString = mapMapString;
  }

  public AdditionalPropertiesClass putMapMapStringItem(String key, java.util.Map<String, String> mapMapStringItem) {
    if (this.mapMapString == null) {
      this.mapMapString = new java.util.HashMap<>();
    }

    this.mapMapString.put(key, mapMapStringItem);
    return this;
  }

  public AdditionalPropertiesClass removeMapMapStringItem(java.util.Map<String, String> mapMapStringItem) {
    if (mapMapStringItem != null && this.mapMapString != null) {
      this.mapMapString.remove(mapMapStringItem);
    }

    return this;
  }
  /**
   **/
  public AdditionalPropertiesClass mapMapAnytype(java.util.Map<String, java.util.Map<String, Object>> mapMapAnytype) {
    this.mapMapAnytype = mapMapAnytype;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("map_map_anytype")
  public java.util.Map<String, java.util.Map<String, Object>> getMapMapAnytype() {
    return mapMapAnytype;
  }

  @JsonProperty("map_map_anytype")
  public void setMapMapAnytype(java.util.Map<String, java.util.Map<String, Object>> mapMapAnytype) {
    this.mapMapAnytype = mapMapAnytype;
  }

  public AdditionalPropertiesClass putMapMapAnytypeItem(String key, java.util.Map<String, Object> mapMapAnytypeItem) {
    if (this.mapMapAnytype == null) {
      this.mapMapAnytype = new java.util.HashMap<>();
    }

    this.mapMapAnytype.put(key, mapMapAnytypeItem);
    return this;
  }

  public AdditionalPropertiesClass removeMapMapAnytypeItem(java.util.Map<String, Object> mapMapAnytypeItem) {
    if (mapMapAnytypeItem != null && this.mapMapAnytype != null) {
      this.mapMapAnytype.remove(mapMapAnytypeItem);
    }

    return this;
  }
  /**
   **/
  public AdditionalPropertiesClass anytype1(Object anytype1) {
    this.anytype1 = anytype1;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("anytype_1")
  public Object getAnytype1() {
    return anytype1;
  }

  @JsonProperty("anytype_1")
  public void setAnytype1(Object anytype1) {
    this.anytype1 = anytype1;
  }

  /**
   **/
  public AdditionalPropertiesClass anytype2(Object anytype2) {
    this.anytype2 = anytype2;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("anytype_2")
  public Object getAnytype2() {
    return anytype2;
  }

  @JsonProperty("anytype_2")
  public void setAnytype2(Object anytype2) {
    this.anytype2 = anytype2;
  }

  /**
   **/
  public AdditionalPropertiesClass anytype3(Object anytype3) {
    this.anytype3 = anytype3;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("anytype_3")
  public Object getAnytype3() {
    return anytype3;
  }

  @JsonProperty("anytype_3")
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
    AdditionalPropertiesClass additionalPropertiesClass = (AdditionalPropertiesClass) o;
    return Objects.equals(this.mapString, additionalPropertiesClass.mapString) &&
        Objects.equals(this.mapNumber, additionalPropertiesClass.mapNumber) &&
        Objects.equals(this.mapInteger, additionalPropertiesClass.mapInteger) &&
        Objects.equals(this.mapBoolean, additionalPropertiesClass.mapBoolean) &&
        Objects.equals(this.mapArrayInteger, additionalPropertiesClass.mapArrayInteger) &&
        Objects.equals(this.mapArrayAnytype, additionalPropertiesClass.mapArrayAnytype) &&
        Objects.equals(this.mapMapString, additionalPropertiesClass.mapMapString) &&
        Objects.equals(this.mapMapAnytype, additionalPropertiesClass.mapMapAnytype) &&
        Objects.equals(this.anytype1, additionalPropertiesClass.anytype1) &&
        Objects.equals(this.anytype2, additionalPropertiesClass.anytype2) &&
        Objects.equals(this.anytype3, additionalPropertiesClass.anytype3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapString, mapNumber, mapInteger, mapBoolean, mapArrayInteger, mapArrayAnytype, mapMapString, mapMapAnytype, anytype1, anytype2, anytype3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalPropertiesClass {\n");
    
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

