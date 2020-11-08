package com.emobileconnect.application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Address {
	
	@Id
	@GeneratedValue
	private Long addressId;
	
	private Long customerId;
	
	private String address_Line_1;
	
	private String address_Line_2;
	
	private String city;
	
	private String state;
	
	private Long zipCode;
	
	private String createdDate;
	
	private String lastModifiedDate;
	
	private String existingPhoneNumber;
	
	Address() {}

	public Address(Long addressId, Long customerId, String address_Line_1, String address_Line_2, String city,
			String state, Long zipCode, String createdDate, String lastModifiedDate, String existingPhoneNumber) {
		super();
		this.addressId = addressId;
		this.customerId = customerId;
		this.address_Line_1 = address_Line_1;
		this.address_Line_2 = address_Line_2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.createdDate = createdDate;
		this.lastModifiedDate = lastModifiedDate;
		this.existingPhoneNumber = existingPhoneNumber;
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getAddress_Line_1() {
		return address_Line_1;
	}

	public void setAddress_Line_1(String address_Line_1) {
		this.address_Line_1 = address_Line_1;
	}

	public String getAddress_Line_2() {
		return address_Line_2;
	}

	public void setAddress_Line_2(String address_Line_2) {
		this.address_Line_2 = address_Line_2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getZipCode() {
		return zipCode;
	}

	public void setZipCode(Long zipCode) {
		this.zipCode = zipCode;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getExistingPhoneNumber() {
		return existingPhoneNumber;
	}

	public void setExistingPhoneNumber(String existingPhoneNumber) {
		this.existingPhoneNumber = existingPhoneNumber;
	}
	
}
