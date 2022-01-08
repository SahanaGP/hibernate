package com.xworkz.patient.dao;

import com.xworkz.patient.entity.PatientEntity;

public interface PatientDAO {

	public void create(PatientEntity entity);
	
	default PatientEntity getById(int id) {
		return null;
		
	}
	
	default void updateAgeById(int newAge,int id) {
		
	}
	
	default  void deleteById(int id) {
		
	}
}
