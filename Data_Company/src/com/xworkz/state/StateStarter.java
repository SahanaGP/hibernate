package com.xworkz.state;

import com.xworkz.state.dao.StateDAO;
import com.xworkz.state.dao.StateDAOImpl;
import com.xworkz.state.entity.StateEntity;

public class StateStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
StateEntity entity=new StateEntity(1,"Karnataka",31,"Bangalore");
StateEntity entity1=new StateEntity(2,"Andhra Pradesh",13,"Amaravati");
StateEntity entity2=new StateEntity(3,"Assam",33,"Dispur");
StateEntity entity3=new StateEntity(4,"Arunachal Pradesh",25,"Itanagar");
StateEntity entity4=new StateEntity(5,"Bihar",38,"Patna");

StateDAO dao=new StateDAOImpl();
dao.create(entity);
dao.create(entity1);
dao.create(entity2);
dao.create(entity3);
dao.create(entity4);

		StateDAO dao1=new StateDAOImpl();	
		dao1.getById(1);
		dao1.updateNoOfDistrictsById(15,2);
		dao1.deleteById(5);
}
}
