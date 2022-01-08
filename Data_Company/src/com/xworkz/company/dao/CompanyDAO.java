package com.xworkz.company.dao;

import com.xworkz.company.entity.CompanyEntity;

public interface CompanyDAO {
 void create(CompanyEntity entity);
 
 default CompanyEntity getById(int id) {
	 return null;
 }
 
 default void updateCompanyWebsiteById(String newWebsite,int id) {
	 
 }
 
 default void deleteById(int id) {
	 
 }
}
