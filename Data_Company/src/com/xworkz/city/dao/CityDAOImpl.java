package com.xworkz.city.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.city.entity.CityEntity;

public class CityDAOImpl implements CityDAO{

	@Override
	public void create(CityEntity entity) {
	
		System.out.println("Invoked create in CityDAO");
		System.out.println(entity);
		
		Configuration configuration=new Configuration();
		
		configuration.configure();
		configuration.addAnnotatedClass(CityEntity.class);
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
	
	public CityEntity getById(int id)
	{
		System.out.println("Invoked getById method");
		System.out.println("Id : "+id);
		CityEntity entity =null;

		SessionFactory factory=new Configuration().configure().addAnnotatedClass(CityEntity.class).buildSessionFactory();

		if(factory!=null)
		{
			Session session=factory.openSession();
			entity=session.get(CityEntity.class, id);

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

	public void updatePopulationById(float newPop,int id)
	{
		System.out.println("Invoked updatePopulationById method");
		System.out.println("passed arguments newPpop= "+newPop+" Id : "+id);

		SessionFactory factory=new Configuration().configure().addAnnotatedClass(CityEntity.class).buildSessionFactory();

		if(factory!=null)
		{
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			CityEntity entity=session.get(CityEntity.class, id);

			if(entity!=null)
			{
				entity.setPopulation(newPop);
				session.update(entity);
				tx.commit();

				System.out.println("Updated population at id= "+id);

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
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(CityEntity.class).buildSessionFactory();

		if(factory!=null)
		{
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			CityEntity entity=session.get(CityEntity.class, id);
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
