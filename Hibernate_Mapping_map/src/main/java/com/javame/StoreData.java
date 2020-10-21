package com.javame;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData {

	public static void main(String[] args) {
		
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
		      
		SessionFactory factory=meta.getSessionFactoryBuilder().build();  
		Session session=factory.openSession();  
		   
		Transaction t=session.beginTransaction();    
		
		Map<String, String> map1=new HashMap<String,String>();    
		map1.put("Java is a programming language","John Milton");    
		map1.put("Java is a platform","Ashok Kumar");    
		    
		Map<String,String> map2=new HashMap<String,String>();    
		map2.put("Servlet technology is a server side programming","John Milton");    
		map2.put("Servlet is an Interface","Ashok Kumar");    
		map2.put("Servlet is a package","Rahul Kumar");    
		    
		Question question1=new Question();
		question1.setName("what is java?");
		question1.setUsername("jonh");
		question1.setAnswers(map1);
		
		Question question2=new Question();
		question2.setName("what is servlet?");
		question2.setUsername("jonh2");
		question2.setAnswers(map2);
		    
		session.save(question1);    
		session.save(question2);    
		    
		t.commit();    
		session.close();   
		factory.close();
		System.out.println("successfully stored");    
		}    
}    
