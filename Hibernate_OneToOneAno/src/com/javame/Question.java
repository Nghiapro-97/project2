package com.javame;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="question")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String qname;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="qid")
	@OrderColumn(name="type")
	private List<Answers> answers;
	
}
