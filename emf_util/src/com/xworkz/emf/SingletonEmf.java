package com.xworkz.emf;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingletonEmf {

	public static EntityManagerFactory entityManagerFactory; 
	
	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}
		
	static{
		entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
	}
}
