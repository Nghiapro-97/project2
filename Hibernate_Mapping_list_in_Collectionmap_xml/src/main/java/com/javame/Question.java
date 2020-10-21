package com.javame;

import java.util.*;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name="question")
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private @NonNull String qname;
	private List<String> answers;
}
