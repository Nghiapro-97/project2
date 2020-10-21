package com.javapoit.jpa;

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
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String street;
	private String zipCode;
	
	@OneToOne
	private Customer customer;
	
	public Address() {
		
	}
	
	public Address(String street, String zipCode) {
		this.street = street;
	    this.zipCode = zipCode;
	}

}
