package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
 public static void main(String[] args) {
	 Configuration cfg=new Configuration();
     cfg.configure("hibernate.cfg.xml");
     SessionFactory factory=cfg.buildSessionFactory();
     
     //creating question
     
     Question q1=new Question();
     q1.setQuestionId(1);
     q1.setQuestion("What is java");
     
     //creating answer
     
     Answer a1=new Answer();
     a1.setAnswerId(11);
     a1.setAnswer("java is programming launguage");
     a1.setQ(q1);
     q1.setAnswer(a1);
     
     
     
     
 //creating question
     
     Question q2=new Question();
     q2.setQuestionId(2);
     q2.setQuestion("What is your name");
     
     //creating answer
     
     Answer a2=new Answer();
     a2.setAnswerId(12);
     a2.setAnswer("Bishal thakur");
     a2.setQ(q2);
     q2.setAnswer(a2);
     Session session=factory.openSession();
     
     Transaction tx=   session.beginTransaction();
    session.save(q1);
    session.save(q2);
    session.save(a1);
    session.save(a2);
    
    tx.commit();
    
    session.close();
     
     
     
     factory.close();
}
}
