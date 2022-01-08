package com.xworkz.company;

import com.xworkz.company.dao.CompanyDAO;
import com.xworkz.company.dao.CompanyDAOImpl;
import com.xworkz.company.entity.CompanyEntity;

public class CompanyStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
CompanyEntity entity=new CompanyEntity(1,"Accenture","Java Developer","Product based","accenture.com");
CompanyEntity entity1=new CompanyEntity(2,"Accenture","Cloud Analyst","Product based","accenture123.com");
CompanyEntity entity2=new CompanyEntity(3,"Oracle","Software Engineer","Product based","oracle.com");

CompanyDAO dao=new CompanyDAOImpl();
dao.create(entity);
dao.create(entity1);
dao.create(entity2);
		
CompanyDAO dao1=new CompanyDAOImpl();

dao1.getById(1);
dao1.updateCompanyWebsiteById("accenture@bangalore.com", 1);
dao1.deleteById(2);
	}

}
