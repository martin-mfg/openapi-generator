package org.openapitools.model;

import org.openapitools.model.Animal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MixedPropertiesAndAdditionalPropertiesClass  {
  
  @ApiModelProperty(value = "")
  private java.util.UUID uuid;

  @ApiModelProperty(value = "")
  private java.util.Date dateTime;

  @ApiModelProperty(value = "")
  @Valid
  private java.util.Map<String, Animal> map = new java.util.HashMap<>();
 /**
   * Get uuid
   * @return uuid
  **/
  @JsonProperty("uuid")
  public java.util.UUID getUuid() {
    return uuid;
  }

  public void setUuid(java.util.UUID uuid) {
    this.uuid = uuid;
  }

  public MixedPropertiesAndAdditionalPropertiesClass uuid(java.util.UUID uuid) {
    this.uuid = uuid;
    return this;
  }

 /**
   * Get dateTime
   * @return dateTime
  **/
  @JsonProperty("dateTime")
  public java.util.Date getDateTime() {
    return dateTime;
  }

  public void setDateTime(java.util.Date dateTime) {
    this.dateTime = dateTime;
  }

  public MixedPropertiesAndAdditionalPropertiesClass dateTime(java.util.Date dateTime) {
    this.dateTime = dateTime;
    return this;
  }

 /**
   * Get map
   * @return map
  **/
  @JsonProperty("map")
  public java.util.Map<String, Animal> getMap() {
    return map;
  }

  public void setMap(java.util.Map<String, Animal> map) {
    this.map = map;
  }

  public MixedPropertiesAndAdditionalPropertiesClass map(java.util.Map<String, Animal> map) {
    this.map = map;
    return this;
  }

  public MixedPropertiesAndAdditionalPropertiesClass putMapItem(String key, Animal mapItem) {
    this.map.put(key, mapItem);
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
    return Objects.equals(uuid, mixedPropertiesAndAdditionalPropertiesClass.uuid) &&
        Objects.equals(dateTime, mixedPropertiesAndAdditionalPropertiesClass.dateTime) &&
        Objects.equals(map, mixedPropertiesAndAdditionalPropertiesClass.map);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

