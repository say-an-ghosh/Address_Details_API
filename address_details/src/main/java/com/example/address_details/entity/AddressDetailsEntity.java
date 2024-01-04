package com.example.address_details.entity;

import org.springframework.validation.annotation.Validated;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "This model is to create a Address Details")
@Entity(name="AddressDetailsEntity")
@Table(name="address_detailS")
@Validated
@Data
@NoArgsConstructor
public class AddressDetailsEntity {
		
	  @Schema
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)	
	  @Column(name = "ID")
	  private Long id = null;
	  
	  @Column(name = "PARTNERKEY")
	  private String partnerKey = null;

	  @Column(name = "HOUSENUMBER")
	  private String houseNumber = null;

	  @Column(name = "STREET")
	  private String street = null;

	  @Column(name = "POSTALCODE")
	  private Integer postalCode = null;

	  @Column(name = "TOWN")
	  private String town = null;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPartnerKey() {
		return partnerKey;
	}

	public void setPartnerKey(String partnerKey) {
		this.partnerKey = partnerKey;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(Integer postalCode) {
		this.postalCode = postalCode;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}
	  
	  
	
}
