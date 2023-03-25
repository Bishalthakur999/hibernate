package com.map1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {
public static void main(String[] args) {
	
	 Configuration cfg=new Configuration();
     cfg.configure("hibernate.cfg.xml");
     SessionFactory factory=cfg.buildSessionFactory();
     
     Emp e1=new Emp();
     e1.setEid(1);
     e1.setName("ravi");
     
     project p1=new project();
     p1.setPid(11);
     p1.setProjectName("employee management system");
     
     
     project p2=new project();
     p2.setPid(12);
     p2.setProjectName("student management system");
     
     
     
     Emp e2=new Emp();
     e2.setEid(2);
     e2.setName("chabi");
     
     List<Emp> list1=new ArrayList<Emp>();
     List<project> list2=new ArrayList<project>();
     
     
     list1.add(e1);
     list1.add(e2);
     
     list2.add(p1);
     list2.add(p2);
     
     
     e1.setProjects(list2);
     p1.setEmps(list1);
     
     
   Session session=factory.openSession();
     
     Transaction tx=   session.beginTransaction();
    session.save(e1);
    session.save(e2);
    session.save(p1);
    session.save(p2);
    
    tx.commit();
    
    session.close();
     
     
     
     
     
     factory.close();
	
}
}
