package com.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut.Certificate;
import com.tut.Student;

public class StateDemo {
	
	public static void main(String[] args) {
		//transient
		
		//persistent
		
		
		//detached
		
		
		//remove
		
		 Configuration cfg=new Configuration();
	     cfg.configure("hibernate.cfg.xml");
	     SessionFactory factory=cfg.buildSessionFactory();
	     
	     
	     //creating student object
	     
	     
	     Student stu=new Student();
	     stu.setId(111);
	     stu.setName("rabi");
	     stu.setCity("biratnagar");
	     stu.setCerti(new Certificate("java","3 month"));
	     //in transient state
	     
	     Session session=factory.openSession();
	     
	     Transaction tx=   session.beginTransaction();
	    session.save(stu);
	    //in persistent state
	    stu.setName("kabi");
	    tx.commit();
	    
	    session.close();
	     
	    //in detached state 
	     
	     
	     
	     
	     
	     
	     factory.close();
	}

}
