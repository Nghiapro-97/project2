package com.javame;

import java.util.*;

import org.apache.logging.log4j.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData {

	private static Logger logger=LogManager.getLogger(StoreData.class);

	public static void main(String[] args) {
		
		logger.debug("this is debug: " + "parameter/exception object");
		logger.info("this is info: " + "parameter/exception object");
		logger.warn("this is warn: " + "parameter/exception object");
		logger.error("this is error: " + "parameter/exception object");
		logger.fatal("this is fatal: " + "parameter/exception object");
		
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		
		Session session=factory.openSession();
		Transaction trans=session.beginTransaction();
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("java is a programming languagge");
		list1.add("java is a platform");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("servlet is an interface");
		list2.add("servlet is an API");
		
		Question question1 = new Question();
		question1.setQname("What is java?");
		question1.setAnswers(list1);
		
		Question question2 = new Question();
		question2.setQname("What is servlet?");
		question2.setAnswers(list2);
		
		session.save(question1);
		session.save(question2);

		trans.commit();
		session.close();
		System.out.println("success");    
	}

}
