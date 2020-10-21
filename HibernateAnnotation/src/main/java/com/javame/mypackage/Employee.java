package com.javame.mypackage;

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
@Table(name="employee")
public class Employee {
	@Id
	private int id;  
	private @NonNull String Name; 
	private double Salary; 
	
	
}
