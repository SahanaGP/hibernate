package com.xworkz.country.dao;

import com.xworkz.country.entity.CountryEntity;

public interface CountryDAO {
	public void create(CountryEntity entity);
	
	default CountryEntity getById(int id) {
		return null;
		
	}
	
	default void updatePopulationById(float newPopu,int id) {
		
	}
	
	default void deleteById(int id) {
		
	}
}
