package com.xworkz.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class EMFUtil {

	private static EntityManagerFactory emf;

	public static EntityManagerFactory getEmf() {
		return emf;
	}

	static {

		emf=Persistence.createEntityManagerFactory("com.xworkz.tour");

	}
}
