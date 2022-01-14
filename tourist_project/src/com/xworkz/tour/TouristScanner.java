package com.xworkz.tour;

//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;

import com.xworkz.tour.dao.TouristDAO;
import com.xworkz.tour.dao.TouristDAOImpl;
import com.xworkz.tour.entity.TouristEntity;

public class TouristScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz.tour");
		//System.out.println(entityManagerFactory);
		
		TouristEntity entity=new TouristEntity(1,"Mandya",100.30d,"SugarCane",100.00f,"Winter");
		TouristEntity entity1=new TouristEntity(2,"Bangalore",22.30d,"Wonderla",1500.00f,"Summer");
        TouristEntity entity2=new TouristEntity(3,"Chitradurga",37.30d,"Fort",500.00f,"winter");



		TouristDAO dao=new TouristDAOImpl();

		dao.put(entity);
		dao.put(entity1);
		dao.put(entity2);
	}

}
