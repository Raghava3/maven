package com.bridgeit.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Iterator;
import java.util.List;
import javax.persistence.Query;
import com.bridgeit.dto.SignupDto;

public class SignupDao {
	
	public Integer register(SignupDto signupDto)
	{
		Configuration cfg=new Configuration();
		cfg.configure("hiber.cfg.xml");
		SessionFactory factory =cfg.buildSessionFactory();
		Session  session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Integer n=(Integer)session.save(signupDto);
		tx.commit();
		session.close();
		return  n;
	}
	
	
	
	public String select(String email , String pass )
	{
		Session session=new Configuration().configure("hiber.cfg.xml").buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
	//	String hql="select d from SignupDto d where email="+email+" and pass="+pass;
		
		System.out.println(email+pass);
		String hql=	("Select d from SignupDto d where d.email='"+email+"' and d.pass='"+pass+"'"); 
		
		
		org.hibernate.Query  query= session.createQuery(hql);
	
		List <SignupDto>result=query.list();
		
		for (Iterator iterator = result.iterator(); iterator.hasNext();)
        {
       	 //getting the element and printing 
	  SignupDto a = (SignupDto)iterator.next();
      String name=a.getFname();
      return name;
		
	}
		return "!!!!";
	
	}
	

}
