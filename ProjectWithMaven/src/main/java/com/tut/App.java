package com.tut;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws IOException
    {
        System.out.println( "project started...." );
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        //creating student
        
        Student st=new Student();
        st.setId(105);
        st.setName("kbain");
        st.setCity("jhapa");
        System.out.println(st);
        
        //creating address of address class
        
        Address ad=new Address();
        ad.setStreet("street1");
        ad.setCity("damak");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(1245.4);
        //Reading image
        
        FileInputStream fis=new FileInputStream("src/main/java/pic.png.png");
       
        byte[] data=new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        
        Session session=factory.openSession();
        
         Transaction tx=   session.beginTransaction();
        session.save(st);
        session.save(ad);
        tx.commit();
        
        session.close();
        System.out.println("Done........");
        
        
        
    }
   
}
