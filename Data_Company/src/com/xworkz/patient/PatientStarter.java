package com.xworkz.patient;

import com.xworkz.patient.dao.PatientDAO;
import com.xworkz.patient.dao.PatientDAOImpl;
import com.xworkz.patient.entity.PatientEntity;

public class PatientStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PatientEntity entity=new PatientEntity(1,"Srikanth","Shivamoga",true,24,24235);
		PatientEntity entity1=new PatientEntity(2,"Sangeetha","Kerala",false,21,0);
		PatientEntity entity2=new PatientEntity(3,"Ravi","Bangalore",false,34,0);
		PatientEntity entity3=new PatientEntity(4,"Kiran","Mysore",true,25,54675);
		PatientEntity entity4=new PatientEntity(5,"Lavanya","Bidar",false,14,0);
		
		PatientDAO dao=new PatientDAOImpl();
		dao.create(entity);
		dao.create(entity1);
		dao.create(entity2);
		dao.create(entity3);
		dao.create(entity4);
}
}	
