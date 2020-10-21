package com.javapoit.jpa;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Subject {
	
	private String name;
	private int marks;
	
	@Id
	private int s_id;
	
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(String name, int marks,int s_id) {
		super();
		this.name = name;
		this.marks = marks;
		this.s_id=s_id;
	}
	
}
