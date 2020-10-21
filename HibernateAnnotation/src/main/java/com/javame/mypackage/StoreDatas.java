package com.javame.mypackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreDatas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		Session session=factory.openSession();
		Transaction trans=session.beginTransaction();
		
		Employee em1=new Employee();
		em1.setName("bibi");
		em1.setSalary(700);
		
		session.save(em1);
		trans.commit();
		System.out.println("Successfully save!");
		factory.close();
		session.close();
	}

}
