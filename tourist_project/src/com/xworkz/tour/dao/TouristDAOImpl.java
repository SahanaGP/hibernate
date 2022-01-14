package com.xworkz.tour.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;


import com.xworkz.tour.entity.TouristEntity;
import com.xworkz.util.EMFUtil;

public class TouristDAOImpl implements TouristDAO{

	@Override
	 public void put(TouristEntity entity) {
	
		
	EntityManagerFactory entityManagerFactory=EMFUtil.getEmf();
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction tx=entityManager.getTransaction();
	tx.begin();
	entityManager.persist(entity);
	tx.commit();
	
}
}
