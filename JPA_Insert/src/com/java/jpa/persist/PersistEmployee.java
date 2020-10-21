package com.java.jpa.persist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.java.jpa.employee.EmployeeEntity;

public class PersistEmployee {
	public static void main(String args[]) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA_Insert");
		EntityManager em=emf.createEntityManager();
		
		//----INSERT Entity------
//		em.getTransaction().begin();
//		
//		EmployeeEntity emp1 = new EmployeeEntity();
//		emp1.setName("bem");
//		emp1.setSalary(300);
//		
//		EmployeeEntity emp2 = new EmployeeEntity();
//		emp2.setName("bin");
//		emp2.setSalary(500);
//		
//		EmployeeEntity emp3 = new EmployeeEntity();
//		emp3.setName("tum");
//		emp3.setSalary(200);
//		
//		try {
//			em.persist(emp1);
//			em.persist(emp2);
//			em.persist(emp3);
//			System.out.println("insert successfull!");
//			
//		} catch (Exception e) {
//			System.out.println("sorry action fail!");
//		}
//		
//		em.getTransaction().commit();
//		emf.close();
//		em.close();
		
		//-----FIND and UPDATE Entity-------
//		try {
//			EmployeeEntity empl=em.find(EmployeeEntity.class, 52);
//			System.out.println("Before Updation");  
//			System.out.println("Student id = " + empl.getid());  
//			System.out.println("Student Name = " + empl.getName());  
//			System.out.println("Student Age = " + empl.getSalary());
//			empl.setSalary(700);
//			System.out.println("After Updation");  
//			System.out.println("Student id = " + empl.getid());  
//			System.out.println("Student Name = " + empl.getName());  
//			System.out.println("Student Age = " + empl.getSalary());
//		} catch (Exception e) {
//			System.out.println("sorry action fail!");
//		}
		
		//-----DELETE Entity-------
		em.getTransaction().begin();
		
		try {
			EmployeeEntity empl=em.find(EmployeeEntity.class, 53);
			em.remove(empl);
			System.out.println("delete successfull!");
		} catch (Exception e) {
			System.out.println("sorry action fail!");
		}
		
		em.getTransaction().commit();
		emf.close();
		em.close();
	}
}
