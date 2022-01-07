package com.xworkz.country;

import com.xworkz.country.dao.CountryDAO;
import com.xworkz.country.dao.CountryDAOImpl;
import com.xworkz.country.entity.CountryEntity;

public class CountryStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
CountryEntity entity=new CountryEntity(1,"India","Asia",139.00f);
CountryEntity entity1=new CountryEntity(2,"Colombia","South America",35.05f);
CountryEntity entity2=new CountryEntity(3,"China","Asia",144.44f);
CountryEntity entity3=new CountryEntity(4,"Egypt","Africa",10.23f);
CountryEntity entity4=new CountryEntity(5,"London","Europe",0.90f);

CountryDAO dao=new CountryDAOImpl();
dao.create(entity);
dao.create(entity1);
dao.create(entity2);
dao.create(entity3);
dao.create(entity4);

	}

}
