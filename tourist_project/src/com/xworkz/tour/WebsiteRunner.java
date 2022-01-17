package com.xworkz.tour;

import com.xworkz.tour.dao.WebsiteDAO;
import com.xworkz.tour.dao.WebsiteDAOImpl;
import com.xworkz.tour.entity.WebsiteEntity;

public class WebsiteRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebsiteEntity entity=new WebsiteEntity("Github","http://github.com",2008,".com","Microsoft");
		WebsiteEntity entity1=new WebsiteEntity("Google","www.google.com",2003,".com","Larry");
		WebsiteEntity entity2=new WebsiteEntity("Gmail","www.gmail.com",2004,".com","Paul Buchheit");
		WebsiteEntity entity3=new WebsiteEntity("Voot","www.voot.com",2015,".com","Viacom18");
		WebsiteEntity entity4=new WebsiteEntity("VTU","vtu.ac.in",2008,".in","Dr.Ashwath Narayan");
		WebsiteEntity entity5=new WebsiteEntity("KSRTC","ksrtc.in",1995,".in","Karnataka Government");
		WebsiteEntity entity6=new WebsiteEntity("Youtube","youtube.com",2000,".com","Shane Dawson");
		WebsiteEntity entity7=new WebsiteEntity("Amazon","www.amazon.com",2008,".com","Andy Jassy");
		WebsiteEntity entity8=new WebsiteEntity("Facebook","http://www.facebook.com",1998,".com","Mark Zuckerberg");
		WebsiteEntity entity9=new WebsiteEntity("Wikipedia","wikipedia.org",1993,".org","Jimmy Donal Wales");
		WebsiteEntity entity10=new WebsiteEntity("Twitter","http://twitter.com",2010,".com","Jack Dorsey");
		WebsiteEntity entity11=new WebsiteEntity("Whatsapp","whatsapp.com",1990,".com","Meta");
		WebsiteEntity entity12=new WebsiteEntity("Instagram","instagram.com",2007,".com","Meta");
		WebsiteEntity entity13=new WebsiteEntity("Pinterest","pinterest.com",1999,".com","Ben Silbermann");
		WebsiteEntity entity14=new WebsiteEntity("International movie database","imdb.com",2002,".com","Col Needham");
		WebsiteEntity entity15=new WebsiteEntity("Netflix","netflix.com",2012,".com","Reed Hastings");
		WebsiteEntity entity16=new WebsiteEntity("Quora","quora.com",1995,".com","Adam Dangelo");
		WebsiteEntity entity17=new WebsiteEntity("National institutes of health","nih.gov",2019,".gov","Lawrence A.Tabak");
		WebsiteEntity entity18=new WebsiteEntity("Internet Archive","archive.org",2010,".org","Brewster Kahle");
		WebsiteEntity entity19=new WebsiteEntity("Zee5","zee5.com",2009,".com","Robert Moon");
		WebsiteEntity entity20=new WebsiteEntity("Ajio","ajio.com",2010,".com","Mukesh Ambani");
		
		
		WebsiteDAO dao=new WebsiteDAOImpl();
		dao.put(entity);
		dao.put(entity1);
		dao.put(entity2);
		dao.put(entity3);
		dao.put(entity4);
		dao.put(entity5);
		dao.put(entity6);
		dao.put(entity7);
		dao.put(entity8);
		dao.put(entity9);
		dao.put(entity10);
		dao.put(entity11);
		dao.put(entity12);
		dao.put(entity13);
		dao.put(entity14);
		dao.put(entity15);
		dao.put(entity16);
		dao.put(entity17);
		dao.put(entity18);
		dao.put(entity19);
		dao.put(entity20);
		

	}
	}


