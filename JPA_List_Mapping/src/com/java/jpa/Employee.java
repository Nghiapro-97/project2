package com.java.jpa;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.*;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private double salary;
	
	@ElementCollection
	private List<Address> address=new ArrayList<Address>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public Employee(String name, double salary, List<Address> address) {
		super();
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
