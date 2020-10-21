package com.javapoit.jpa;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@OneToOne(mappedBy = "customer", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	private Address address;
	
	public Customer() {
		
	}
	
	public Customer(String name) {
        this.name=name;
    }
}
