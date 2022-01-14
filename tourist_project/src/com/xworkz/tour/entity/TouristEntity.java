package com.xworkz.tour.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tourist_table")
public class TouristEntity implements Serializable{

	@Id
	@Column(name="t_id")
	private int touristId;
	@Column(name="location")
	private String location;
	@Column(name="sealevel")
	private double seaLevel;
	@Column(name="famousfor")
	private String famousFor;
	@Column(name="entryfees")
	private float entryFees;
	@Column(name="season")
	private String season;
	
	public TouristEntity() {
		
	}

	public TouristEntity(int touristId, String location, double seaLevel, String famousFor, float entryFees,
			String season) {
		super();
		this.touristId = touristId;
		this.location = location;
		this.seaLevel = seaLevel;
		this.famousFor = famousFor;
		this.entryFees = entryFees;
		this.season = season;
	}

	@Override
	public String toString() {
		return "TouristEntity [touristId=" + touristId + ", location=" + location + ", seaLevel=" + seaLevel
				+ ", famousFor=" + famousFor + ", entryFees=" + entryFees + ", season=" + season + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + touristId;
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
		TouristEntity other = (TouristEntity) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (touristId != other.touristId)
			return false;
		return true;
	}

	public int getTouristId() {
		return touristId;
	}

	public void setTouristId(int touristId) {
		this.touristId = touristId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getSeaLevel() {
		return seaLevel;
	}

	public void setSeaLevel(double seaLevel) {
		this.seaLevel = seaLevel;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public float getEntryFees() {
		return entryFees;
	}

	public void setEntryFees(float entryFees) {
		this.entryFees = entryFees;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}
	
	
}
