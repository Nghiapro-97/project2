package com.javame;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="answers")
public class Answers {

	@Id
	@GeneratedValue
	private int id;
	private String answername;
	private String postedBy;
	
}
