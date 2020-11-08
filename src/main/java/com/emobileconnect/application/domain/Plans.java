package com.emobileconnect.application.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Plans {
	
	@Id
	@GeneratedValue
	private Long planId;
	
	private String planName;
	
	private String planDescription;
	
	private BigDecimal planPrice;
	
	private String createdDate;
	
	private String lastModifiedDate;
	
	Plans(){}

	public Plans(Long planId, String planName, String planDescription, BigDecimal planPrice, String createdDate,
			String lastModifiedDate) {
		super();
		this.planId = planId;
		this.planName = planName;
		this.planDescription = planDescription;
		this.planPrice = planPrice;
		this.createdDate = createdDate;
		this.lastModifiedDate = lastModifiedDate;
	}

	public Long getPlanId() {
		return planId;
	}

	public void setPlanId(Long planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanDescription() {
		return planDescription;
	}

	public void setPlanDescription(String planDescription) {
		this.planDescription = planDescription;
	}

	public BigDecimal getPlanPrice() {
		return planPrice;
	}

	public void setPlanPrice(BigDecimal planPrice) {
		this.planPrice = planPrice;
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
}
