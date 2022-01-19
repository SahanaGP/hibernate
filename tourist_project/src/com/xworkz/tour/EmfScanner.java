package com.xworkz.tour;

import javax.persistence.EntityManagerFactory;

import com.xworkz.emf.SingletonEmf;

public class EmfScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf=SingletonEmf.getEntityManagerFactory();
		System.out.println(emf);
	}

}
