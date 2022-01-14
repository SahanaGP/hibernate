package com.xworkz.tour.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.tour.entity.FactoryEntity;
import com.xworkz.util.EMFUtil;

public class FactoryDAOImpl implements FactoryDAO {
public void put(FactoryEntity entity)
{
	EntityManagerFactory emf=EMFUtil.getEmf();
	EntityManager entityManager=emf.createEntityManager();
	EntityTransaction tx=entityManager.getTransaction();
	tx.begin();
	entityManager.persist(entity);
	tx.commit();


}
}
