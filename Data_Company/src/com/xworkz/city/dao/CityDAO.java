package com.xworkz.city.dao;

import com.xworkz.city.entity.CityEntity;

public interface CityDAO {

	public void create(CityEntity entity);
	
	default CityEntity getById(int id) {
		return null;
	}
	
    default void updatePopulationById(float f,int id) {
	
     }
    
    default void deleteById(int id) {
    	
    }
}
