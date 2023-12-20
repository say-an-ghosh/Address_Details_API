package com.example.address_details.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AddressDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-12-21T02:53:22.458217500+05:30[Asia/Calcutta]")


public class AddressDetails   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("partnerKey")
  private String partnerKey = null;

  @JsonProperty("houseNumber")
  private String houseNumber = null;

  @JsonProperty("street")
  private String street = null;

  @JsonProperty("postalCode")
  private Integer postalCode = null;

  @JsonProperty("town")
  private String town = null;

  public AddressDetails id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "111", description = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AddressDetails partnerKey(String partnerKey) {
    this.partnerKey = partnerKey;
    return this;
  }

  /**
   * Get partnerKey
   * @return partnerKey
   **/
  @Schema(example = "P123", description = "")
  
    public String getPartnerKey() {
    return partnerKey;
  }

  public void setPartnerKey(String partnerKey) {
    this.partnerKey = partnerKey;
  }

  public AddressDetails houseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
    return this;
  }

  /**
   * Get houseNumber
   * @return houseNumber
   **/
  @Schema(example = "123", description = "")
  
    public String getHouseNumber() {
    return houseNumber;
  }

  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }

  public AddressDetails street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Get street
   * @return street
   **/
  @Schema(example = "NW Middleton Row, St. Robert,", description = "")
  
    public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public AddressDetails postalCode(Integer postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Get postalCode
   * @return postalCode
   **/
  @Schema(example = "2546", description = "")
  
    public Integer getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(Integer postalCode) {
    this.postalCode = postalCode;
  }

  public AddressDetails town(String town) {
    this.town = town;
    return this;
  }

  /**
   * Get town
   * @return town
   **/
  @Schema(example = "Kingston,", description = "")
  
    public String getTown() {
    return town;
  }

  public void setTown(String town) {
    this.town = town;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressDetails addressDetails = (AddressDetails) o;
    return Objects.equals(this.id, addressDetails.id) &&
        Objects.equals(this.partnerKey, addressDetails.partnerKey) &&
        Objects.equals(this.houseNumber, addressDetails.houseNumber) &&
        Objects.equals(this.street, addressDetails.street) &&
        Objects.equals(this.postalCode, addressDetails.postalCode) &&
        Objects.equals(this.town, addressDetails.town);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, partnerKey, houseNumber, street, postalCode, town);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    partnerKey: ").append(toIndentedString(partnerKey)).append("\n");
    sb.append("    houseNumber: ").append(toIndentedString(houseNumber)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    town: ").append(toIndentedString(town)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
