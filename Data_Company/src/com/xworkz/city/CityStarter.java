package com.xworkz.city;

import com.xworkz.city.dao.CityDAO;
import com.xworkz.city.dao.CityDAOImpl;
import com.xworkz.city.entity.CityEntity;


public class CityStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
CityEntity entity=new CityEntity(1,"Bangalore",12.327f,"IT hub","Red");
CityEntity entity1=new CityEntity(2,"Mysore",1.21f,"Palace","Orange");
CityEntity entity2=new CityEntity(3,"Coorg",0.8f,"Coffee","Yellow");
CityEntity entity3=new CityEntity(4,"Kerala",13.56f,"Culture","Orange");
CityEntity entity4=new CityEntity(5,"Maharastra",67.21f,"GateWay","Red");

CityDAO dao=new CityDAOImpl();
dao.create(entity);
dao.create(entity1);
dao.create(entity2);
dao.create(entity3);
dao.create(entity4);

CityDAO dao1=new CityDAOImpl();
dao1.getById(4);
dao1.updatePopulationById(77.89f, 5);
dao1.deleteById(3);
	}
}
