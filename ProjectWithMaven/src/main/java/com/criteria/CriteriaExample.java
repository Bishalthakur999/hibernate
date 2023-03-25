package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.tut.Student;

public class CriteriaExample {
	public static void main(String[] args) {
		
		 Configuration cfg=new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory=cfg.buildSessionFactory();
	        
	        Session session=factory.openSession();
	        
	        Criteria c=session.createCriteria(Student.class);
	     //   c.add(Restrictions.eq("city","jhapa"));
	        
	        
	        c.add(Restrictions.gt("id",104));
	        
                   List<Student> list=c.list();
	        
	        
	        
	        for(Student stu:list) {
	        	System.out.println(stu);
	        }
	        
	        
	        
	        
	        session.close();
	        factory.close();
	}

}
