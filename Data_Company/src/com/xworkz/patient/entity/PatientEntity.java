package com.xworkz.patient.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient_detailss")
public class PatientEntity {

	@Id
	@Column(name="patient_id")
	private int patientId;
	@Column(name="patient_name")
	private String patientName;
	@Column(name="birthplace")
	private String birthPlace;
	@Column(name="corona")
	private boolean corona;
	@Column(name="age")
	private int age;
	@Column(name="bu_no")
	private int buNo;
	
	public PatientEntity() {
		
	}

	public PatientEntity(int patientId, String patientName, String birthPlace, boolean corona, int age, int buNo) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.birthPlace = birthPlace;
		this.corona = corona;
		this.age = age;
		this.buNo = buNo;
	}

	@Override
	public String toString() {
		return "PatientEntity [patientId=" + patientId + ", patientName=" + patientName + ", birthPlace=" + birthPlace
				+ ", corona=" + corona + ", age=" + age + ", buNo=" + buNo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + patientId;
		result = prime * result + ((patientName == null) ? 0 : patientName.hashCode());
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
		PatientEntity other = (PatientEntity) obj;
		if (patientId != other.patientId)
			return false;
		if (patientName == null) {
			if (other.patientName != null)
				return false;
		} else if (!patientName.equals(other.patientName))
			return false;
		return true;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public boolean isCorona() {
		return corona;
	}

	public void setCorona(boolean corona) {
		this.corona = corona;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getBuNo() {
		return buNo;
	}

	public void setBuNo(int buNo) {
		this.buNo = buNo;
	}
	
	
}
