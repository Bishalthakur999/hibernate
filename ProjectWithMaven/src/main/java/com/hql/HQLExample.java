package com.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut.Student;


public class HQLExample {
	public static void main(String[] args) {
		 System.out.println( "project started...." );
	        Configuration cfg=new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory=cfg.buildSessionFactory();
	        
	        Session session=factory.openSession();
	        
	        
	        String query="from Student";
	        
	      Query  q=session.createQuery(query);
	        
	        
	        List<Student> list=q.list();
	        
	        
	        
	        for(Student stu:list) {
	        	System.out.println(stu.getName()+" ");
	        }
	        
	        
	        
	        String qu="from Student where city='janakpur'";   
	        
	        
		      Query  m=session.createQuery(qu);
		        
		        
		        List<Student> lis=m.list();
		        
		        
		        
		        for(Student stu:lis) {
		        	System.out.println(stu.getName()+" ");
		        }
System.out.println("----------------------------------------------------------------------------------------------------------");

               Transaction tx=   session.beginTransaction();

                 // delete ko query
//            Query  q2=session.createQuery("delete from Student where city='janakpur'");
//    
//              int r=q2.executeUpdate();
//              System.out.println("deleted.......");
//              System.out.println(r);
//             
    
    
               
               //update
               
               Query  q2=session.createQuery("update  Student set city=:c where name=:n");
               q2.setParameter("c","sil");
               q2.setParameter("n","jabi");
               int r=q2.executeUpdate();
            System.out.println("updated.......");
             System.out.println(r);
    
            tx.commit();
		     
	        
	        
	        session.close();
	        
	        factory.close();
	}
}
