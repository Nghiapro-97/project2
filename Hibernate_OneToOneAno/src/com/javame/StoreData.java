package com.javame;

import java.util.ArrayList;

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
	      
	    Answers ans1=new Answers();  
	    ans1.setAnswername("Java is a programming language");  
	    ans1.setPostedBy("Ravi Malik");  
	      
	    Answers ans2=new Answers();  
	    ans2.setAnswername("Java is a platform");  
	    ans2.setPostedBy("Sudhir Kumar");  
	      
	    Answers ans3=new Answers();  
	    ans3.setAnswername("Servlet is an Interface");  
	    ans3.setPostedBy("Jai Kumar");  
	      
	    Answers ans4=new Answers();  
	    ans4.setAnswername("Servlet is an API");  
	    ans4.setPostedBy("Arun");  
	      
	    ArrayList<Answers> list1=new ArrayList<Answers>();  
	    list1.add(ans1);  
	    list1.add(ans2);  
	      
	    ArrayList<Answers> list2=new ArrayList<Answers>();  
	    list2.add(ans3);  
	    list2.add(ans4);  
	      
	    Question question1=new Question();  
	    question1.setQname("What is Java?");  
	    question1.setAnswers(list1);  
	      
	    Question question2=new Question();  
	    question2.setQname("What is Servlet?");  
	    question2.setAnswers(list2);  
	      
	    session.persist(question1);  
	    session.persist(question2);  
	      
	    t.commit();  
	    session.close();  
	    System.out.println("success");  
	}

}
