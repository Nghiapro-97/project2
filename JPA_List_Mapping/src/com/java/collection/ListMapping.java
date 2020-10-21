package com.java.collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.java.jpa.*;

public class ListMapping {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA_List_Mapping");
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		Address addr1 = new Address();
		addr1.setPincode(201301);
		addr1.setCity("TP.HCM");
		addr1.setState("ThuDuc");
		
		Address addr2 = new Address();
		addr2.setPincode(201302);
		addr2.setCity("HaNoi");
		addr2.setState("DongDa");
		
		Employee emp1 = new Employee();
		emp1.setName("Bun");
		emp1.setSalary(700);
		emp1.getAddress().add(addr1);
		
		Employee emp2 = new Employee();
		emp2.setName("Ket");
		emp2.setSalary(800);
		emp2.getAddress().add(addr2);
		
		try {
			em.persist(emp1);
			em.persist(emp2);
			System.out.println("Acction successfull!");
		} catch (Exception e) {
			System.out.println("Acction fail!");
		}
		
		em.getTransaction().commit();

		emf.close();
		em.close();
	}

}
