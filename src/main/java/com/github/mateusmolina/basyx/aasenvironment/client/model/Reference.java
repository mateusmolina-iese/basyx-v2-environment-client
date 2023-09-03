/*
 * BaSyx AAS Environment Component
 * AAS Environment API
 *
 * The version of the OpenAPI document: 2.0
 * Contact: basyx-dev@eclipse.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.mateusmolina.basyx.aasenvironment.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.github.mateusmolina.basyx.aasenvironment.client.model.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Reference
 */
@JsonPropertyOrder({
  Reference.JSON_PROPERTY_TYPE,
  Reference.JSON_PROPERTY_KEYS,
  Reference.JSON_PROPERTY_REFERRED_SEMANTIC_I_D
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-03T12:33:09.780850700+02:00[Europe/Berlin]")
public class Reference {
  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    EXTERNAL_REFERENCE("EXTERNAL_REFERENCE"),
    
    MODEL_REFERENCE("MODEL_REFERENCE");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_KEYS = "keys";
  private List<Key> keys;

  public static final String JSON_PROPERTY_REFERRED_SEMANTIC_I_D = "referredSemanticID";
  private Reference referredSemanticID;

  public Reference() {
  }

  public Reference type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Reference keys(List<Key> keys) {
    
    this.keys = keys;
    return this;
  }

  public Reference addKeysItem(Key keysItem) {
    if (this.keys == null) {
      this.keys = new ArrayList<>();
    }
    this.keys.add(keysItem);
    return this;
  }

   /**
   * Get keys
   * @return keys
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Key> getKeys() {
    return keys;
  }


  @JsonProperty(JSON_PROPERTY_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeys(List<Key> keys) {
    this.keys = keys;
  }


  public Reference referredSemanticID(Reference referredSemanticID) {
    
    this.referredSemanticID = referredSemanticID;
    return this;
  }

   /**
   * Get referredSemanticID
   * @return referredSemanticID
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERRED_SEMANTIC_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Reference getReferredSemanticID() {
    return referredSemanticID;
  }


  @JsonProperty(JSON_PROPERTY_REFERRED_SEMANTIC_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferredSemanticID(Reference referredSemanticID) {
    this.referredSemanticID = referredSemanticID;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reference reference = (Reference) o;
    return Objects.equals(this.type, reference.type) &&
        Objects.equals(this.keys, reference.keys) &&
        Objects.equals(this.referredSemanticID, reference.referredSemanticID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, keys, referredSemanticID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reference {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
    sb.append("    referredSemanticID: ").append(toIndentedString(referredSemanticID)).append("\n");
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

