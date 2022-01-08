package com.xworkz.company.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.xworkz.company.entity.CompanyEntity;

public class CompanyDAOImpl implements CompanyDAO {

	@Override
	public void create(CompanyEntity entity) {
	
		System.out.println("Invoked create in CompanyDAO");
		
		//System.out.println("Entity".concat(entity.toString()));
		System.out.println(entity);
		
		Configuration configuration=new Configuration();
		
		configuration.configure();
		configuration.addAnnotatedClass(CompanyEntity.class);
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
	
	public CompanyEntity getById(int id)
	{
		System.out.println("Invoked getById method");
		System.out.println("Id : "+id);
		CompanyEntity entity =null;

		SessionFactory factory=new Configuration().configure().addAnnotatedClass(CompanyEntity.class).buildSessionFactory();

		if(factory!=null)
		{
			Session session=factory.openSession();
			entity=session.get(CompanyEntity.class, id);

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

	public void updateCompanyWebsiteById(String newWebsite,int id)
	{
		System.out.println("Invoked updateCompanyWebsiteById method");
		System.out.println("passed arguments new Website= "+newWebsite+" Id : "+id);

		SessionFactory factory=new Configuration().configure().addAnnotatedClass(CompanyEntity.class).buildSessionFactory();

		if(factory!=null)
		{
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			CompanyEntity entity=session.get(CompanyEntity.class, id);

			if(entity!=null)
			{
				entity.setCompanyWebsite(newWebsite);
				session.update(entity);
				tx.commit();

				System.out.println("Updated company website at id= "+id);

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
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(CompanyEntity.class).buildSessionFactory();

		if(factory!=null)
		{
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			CompanyEntity entity=session.get(CompanyEntity.class, id);
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
