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
	
	public StateEntity getById(int id)
	{
		System.out.println("Invoked getById method");
		System.out.println("Id : "+id);
		StateEntity entity =null;

		SessionFactory factory=new Configuration().configure().addAnnotatedClass(StateEntity.class).buildSessionFactory();

		if(factory!=null)
		{
			Session session=factory.openSession();
			entity=session.get(StateEntity.class, id);

			if(entity!=null)
			{
				System.out.println("entity found at id= "+id);
			}

			else
			{
				System.out.println("No entity was found at id= "+id);
			}
			session.close();
		}

		factory.close();
		return entity;
	}

	@Override

	public void updateNoOfDistrictsById(int newDistricts,int id)
	{
		System.out.println("Invoked updateNoOfDistrictsById method");
		System.out.println("passed arguments new noOfDistricts= "+newDistricts+" Id : "+id);

		SessionFactory factory=new Configuration().configure().addAnnotatedClass(StateEntity.class).buildSessionFactory();

		if(factory!=null)
		{
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			StateEntity entity=session.get(StateEntity.class, id);

			if(entity!=null)
			{
				entity.setNoOfDistricts(newDistricts);
				session.update(entity);
				tx.commit();

				System.out.println("Updated company no of districts at id= "+id);

			}
			else
			{
				System.out.println("improper id ");
			}
			session.close();
		}
		factory.close();
	}
	@Override	
	public void deleteById(int id)
	{
		System.out.println("Invoked deleteById method");
		System.out.println("Id : "+id);
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(StateEntity.class).buildSessionFactory();

		if(factory!=null)
		{
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			StateEntity entity=session.get(StateEntity.class, id);
			if(entity!=null)
			{
				session.delete(entity);
				tx.commit();
				System.out.println("Deleted entity at id= "+id);

			}
			else
			{
				System.out.println("no entity found at id= "+id);
			}

			session.close();

		}
		factory.close();

	}
}
