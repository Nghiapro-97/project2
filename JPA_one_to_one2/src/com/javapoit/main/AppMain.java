package com.javapoit.main;

import java.util.*;

import javax.persistence.*;

//import com.javapoit.jpa.*;

public class AppMain {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA_one_to_one2");
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		
		////----jpa one-to-one mapping joincolum
//		Customer c = new Customer("Miss Xing");
//        Address address = new Address("1000 N 4th", "52556");
//        c.setAddress(address);
//        address.setCustomer(c);
//        
//        try {			
//        	em.persist(c);
//        	em.persist(address);
//        	//em.remove(c);
//        	System.out.println("Successfull!");
//		} catch (Exception e) {
//			System.out.println("Fail!");
//		}
		
		////----cascade persist
//		Student stu1 = new Student();
//		stu1.setS_id(101);
//		stu1.setS_name("kity");
//		stu1.setS_age(22);
//		
//		Student stu2 = new Student();
//		stu2.setS_id(102);
//		stu2.setS_name("linhka");
//		stu2.setS_age(21);
//		
//		Subject sub1 = new Subject();
//		sub1.setName("English");
//		sub1.setMarks(10);
//		sub1.setS_id(stu1.getS_id());
//		
//		Subject sub2 = new Subject();
//		sub2.setName("TOEIC");
//		sub2.setMarks(700);
//		sub2.setS_id(stu2.getS_id());
//		
//		stu1.setSub(sub1);
//		stu2.setSub(sub2);
//		
//		try {
//			em.persist(stu1);
//			em.persist(stu2);
//			System.out.println("Successfull!");
//		} catch (Exception e) {
//			System.out.println("Fail!");
//		}
		
		////----cascade remove-----
//		try {
//			Student stu=em.find(Student.class, 101);
//			em.remove(stu);
//			
//			System.out.println("Successfull!");
//		} catch (Exception e) {
//			System.out.println("Fail!");
//		}
		
		////-----JPQL use createQuery() method------
		Query query=em.createQuery("select s.s_name from Student s");
		@SuppressWarnings("unchecked")
		List<String> list=query.getResultList();
	    System.out.println("Student name: ");
		for (String s : list) {
			System.out.println(s);
		}
		
		em.getTransaction().commit();
		emf.close();
		em.close();
	}

}
