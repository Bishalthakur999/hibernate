package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
	 public static void main(String[] args) {
		  Configuration cfg=new Configuration();
	       cfg.configure("hibernate.cfg.xml");
	       SessionFactory factory=cfg.buildSessionFactory();

	        Student s1=new Student();
	        s1.setId(101);
	        s1.setName("priyanshi");
	        s1.setCity("janakpur");
	        
	        Certificate c1=new Certificate();
	        c1.setCourse("java");
	        c1.setDuration("1yr");
	        s1.setCerti(c1);
	      
	        Student s2=new Student();
	        s2.setId(102);
	        s2.setName("chabi");
	        s2.setCity("mahendeanagaar");
	        
	        Certificate c2=new Certificate();
	        c2.setCourse("spring boot");
	        c2.setDuration("2 month");
	        s2.setCerti(c2);
	        Session session=factory.openSession();
	        
	         Transaction tx=   session.beginTransaction();
	        session.save(s1);
	        session.save(s2);
	        tx.commit();
	        
	        session.close();
	       factory.close();
          
	}
}
