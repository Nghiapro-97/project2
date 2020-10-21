package com.java.jpa.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "employee")
public class EmployeeEntity {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private double salary;
	
	public EmployeeEntity(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
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
	
}
