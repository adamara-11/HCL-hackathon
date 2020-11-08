package com.emobileconnect.application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Customer {
	
	@Id
	@GeneratedValue
	private Long customerId;
	
	private String firstName;
	
	private String lastName;
	
	private String emailId;
	
	private String createdDate;
	
	private String lastModifiedDate;
	
	private String activePlan;
	
	private String activationStatus;
	
	private String documentNumber;
	
	public Customer() {}

	public Customer(Long customerId, String firstName, String lastName, String emailId, String createdDate,
			String lastModifiedDate, String activePlan, String activationStatus, String documentNumber) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.createdDate = createdDate;
		this.lastModifiedDate = lastModifiedDate;
		this.activePlan = activePlan;
		this.activationStatus = activationStatus;
		this.documentNumber = documentNumber;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
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

	public String getActivePlan() {
		return activePlan;
	}

	public void setActivePlan(String activePlan) {
		this.activePlan = activePlan;
	}

	public String getActivationStatus() {
		return activationStatus;
	}

	public void setActivationStatus(String activationStatus) {
		this.activationStatus = activationStatus;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

}
