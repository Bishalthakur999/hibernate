package com.pegination;

import org.hibernate.query.Query;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class HQLPegination {
      public static void main(String[] args) {
    	  Configuration cfg=new Configuration();
          cfg.configure("hibernate.cfg.xml");
          SessionFactory factory=cfg.buildSessionFactory();
          
          
          Session session=factory.openSession();
          
          
          
          Query q=session.createQuery("from Studnet");
          
          
          //implementing pegination
          
          q.setFirstResult(0);
          q.setMaxResults(5);
          
          List<Student> list=q.list();
	        
	        
	        
	        for(Student stu:list) {
	        	System.out.println(stu.getName()+" "+stu.getId());
	        }
	        
          
          
          
          session.close();
          
          
          factory.close();
	}
}
