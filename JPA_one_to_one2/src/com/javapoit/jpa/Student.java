package com.javapoit.jpa;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Student {
	
	@Id
	private int s_id;
	private String s_name;
	private int s_age;
	
	@OneToOne(cascade = CascadeType.REMOVE)
	private Subject sub;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String s_name, int s_age, Subject sub) {
		super();
		this.s_name = s_name;
		this.s_age = s_age;
		this.sub=sub;
	}
	
}
