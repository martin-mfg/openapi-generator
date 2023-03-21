package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Animal;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("MixedPropertiesAndAdditionalPropertiesClass")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class MixedPropertiesAndAdditionalPropertiesClass  implements Serializable {
  private @Valid java.util.UUID uuid;
  private @Valid java.util.Date dateTime;
  private @Valid java.util.Map<String, Animal> map = new java.util.HashMap<>();

  /**
   **/
  public MixedPropertiesAndAdditionalPropertiesClass uuid(java.util.UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("uuid")
  public java.util.UUID getUuid() {
    return uuid;
  }

  @JsonProperty("uuid")
  public void setUuid(java.util.UUID uuid) {
    this.uuid = uuid;
  }

  /**
   **/
  public MixedPropertiesAndAdditionalPropertiesClass dateTime(java.util.Date dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dateTime")
  public java.util.Date getDateTime() {
    return dateTime;
  }

  @JsonProperty("dateTime")
  public void setDateTime(java.util.Date dateTime) {
    this.dateTime = dateTime;
  }

  /**
   **/
  public MixedPropertiesAndAdditionalPropertiesClass map(java.util.Map<String, Animal> map) {
    this.map = map;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("map")
  public java.util.Map<String, Animal> getMap() {
    return map;
  }

  @JsonProperty("map")
  public void setMap(java.util.Map<String, Animal> map) {
    this.map = map;
  }

  public MixedPropertiesAndAdditionalPropertiesClass putMapItem(String key, Animal mapItem) {
    if (this.map == null) {
      this.map = new java.util.HashMap<>();
    }

    this.map.put(key, mapItem);
    return this;
  }

  public MixedPropertiesAndAdditionalPropertiesClass removeMapItem(Animal mapItem) {
    if (mapItem != null && this.map != null) {
      this.map.remove(mapItem);
    }

    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MixedPropertiesAndAdditionalPropertiesClass mixedPropertiesAndAdditionalPropertiesClass = (MixedPropertiesAndAdditionalPropertiesClass) o;
    return Objects.equals(this.uuid, mixedPropertiesAndAdditionalPropertiesClass.uuid) &&
        Objects.equals(this.dateTime, mixedPropertiesAndAdditionalPropertiesClass.dateTime) &&
        Objects.equals(this.map, mixedPropertiesAndAdditionalPropertiesClass.map);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, dateTime, map);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MixedPropertiesAndAdditionalPropertiesClass {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    map: ").append(toIndentedString(map)).append("\n");
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

