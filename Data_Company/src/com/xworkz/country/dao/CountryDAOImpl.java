package com.xworkz.country.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.country.entity.CountryEntity;

public class CountryDAOImpl implements CountryDAO{

	@Override
	public void create(CountryEntity entity) {
	
		System.out.println("Invoked create in CountryDAO");
		System.out.println(entity);
		
		Configuration configuration=new Configuration();
		
		configuration.configure();
		configuration.addAnnotatedClass(CountryEntity.class);
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
	
	public CountryEntity getById(int id)
	{
		System.out.println("Invoked getById method");
		System.out.println("Id : "+id);
		CountryEntity entity =null;

		SessionFactory factory=new Configuration().configure().addAnnotatedClass(CountryEntity.class).buildSessionFactory();

		if(factory!=null)
		{
			Session session=factory.openSession();
			entity=session.get(CountryEntity.class, id);

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

	public void updatePopulationById(float newPopu,int id)
	{
		System.out.println("Invoked updatePopulationById method");
		System.out.println("passed arguments new Population= "+newPopu+" Id : "+id);

		SessionFactory factory=new Configuration().configure().addAnnotatedClass(CountryEntity.class).buildSessionFactory();

		if(factory!=null)
		{
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			CountryEntity entity=session.get(CountryEntity.class, id);

			if(entity!=null)
			{
				entity.setPopulation(newPopu);
				session.update(entity);
				tx.commit();

				System.out.println("Updated country population at id= "+id);

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
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(CountryEntity.class).buildSessionFactory();

		if(factory!=null)
		{
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			CountryEntity entity=session.get(CountryEntity.class, id);
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
