package com.javatpoint.mypackage;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Employee {
	private int id;  
	private @NonNull String Name; 
	private double Salary; 
	
	
}
