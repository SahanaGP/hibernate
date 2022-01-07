package com.xworkz.company.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="company_details")

public class CompanyEntity implements Serializable{
@Id
@Column(name="companyid")
	private int companyID;
@Column(name="companyname")
	private String companyName;
@Column(name="companydomain")
	private String companyDomain;
@Column(name="companytype")
	private String companyType;
@Column(name="companywebsite")
	private String companyWebsite;
	
	
	public CompanyEntity() {
		
	}
	

	public CompanyEntity(int companyID, String companyName, String companyDomain, String companyType,
			String companyWebsite) {
		super();
		this.companyID = companyID;
		this.companyName = companyName;
		this.companyDomain = companyDomain;
		this.companyType = companyType;
		this.companyWebsite = companyWebsite;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + companyID;
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompanyEntity other = (CompanyEntity) obj;
		if (companyID != other.companyID)
			return false;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "CompanyEntity [companyID=" + companyID + ", companyName=" + companyName + ", companyDomain="
				+ companyDomain + ", companyType=" + companyType + ", companyWebsite=" + companyWebsite + "]";
	}

	public int getCompanyID() {
		return companyID;
	}

	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyDomain() {
		return companyDomain;
	}

	public void setCompanyDomain(String companyDomain) {
		this.companyDomain = companyDomain;
	}

	public String getCompanyType() {
		return companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getCompanyWebsite() {
		return companyWebsite;
	}

	public void setCompanyWebsite(String companyWebsite) {
		this.companyWebsite = companyWebsite;
	}
	
	
}
