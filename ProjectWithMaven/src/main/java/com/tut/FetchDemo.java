package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	  public static void main(String[] args) {
		  Configuration cfg=new Configuration();
	       cfg.configure("hibernate.cfg.xml");
	       SessionFactory factory=cfg.buildSessionFactory();
 
	        Session session=factory.openSession();
	        
	        // using get method
	       Student student=(Student)session.get(Student.class,102);
	       System.out.println(student);
	       //using load method
	       Student st=(Student)session.load(Student.class,102);
	       System.out.println(st);
	       
	       
	       Address ad=(Address)session.get(Address.class,1);
	       System.out.println(ad.getCity()+" "+ad.getAddressId()); 
	        session.close();
	       factory.close();
           
	}
}
