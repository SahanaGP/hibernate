package com.xworkz.state.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.state.entity.StateEntity;

public class StateDAOImpl implements StateDAO {

	@Override
	public void create(StateEntity entity) {
	
		System.out.println("Invoked create in CompanyDAO");
		System.out.println(entity);
		
		Configuration configuration=new Configuration();
		
		configuration.configure();
		configuration.addAnnotatedClass(StateEntity.class);
		SessionFactory factory=configuration.buildSessionFactory();
		if(factory!=null) {
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			session.save(entity);
			tx.commit();
			session.close();	
		}
		factory.close();
	}
}
