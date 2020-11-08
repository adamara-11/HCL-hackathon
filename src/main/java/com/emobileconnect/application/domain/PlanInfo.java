package com.emobileconnect.application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class PlanInfo {
	
	@Id
	@GeneratedValue
	private Long planInfoId;
	
	private String planName;
	
	private String simCardNumber;
	
	private Long newPhoneNumber;
	
	private String createdDate;
	
	private String lastModifiedDate;
	
	private String status;
	
	PlanInfo() {}
	
	public PlanInfo(Long planInfoId, String planName, String simCardNumber, Long newPhoneNumber, String createdDate,
			String lastModifiedDate, String status) {
		super();
		this.planInfoId = planInfoId;
		this.planName = planName;
		this.simCardNumber = simCardNumber;
		this.newPhoneNumber = newPhoneNumber;
		this.createdDate = createdDate;
		this.lastModifiedDate = lastModifiedDate;
		this.status = status;
	}

	public Long getPlanInfoId() {
		return planInfoId;
	}

	public void setPlanInfoId(Long planInfoId) {
		this.planInfoId = planInfoId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getSimCardNumber() {
		return simCardNumber;
	}

	public void setSimCardNumber(String simCardNumber) {
		this.simCardNumber = simCardNumber;
	}

	public Long getNewPhoneNumber() {
		return newPhoneNumber;
	}

	public void setNewPhoneNumber(Long newPhoneNumber) {
		this.newPhoneNumber = newPhoneNumber;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
