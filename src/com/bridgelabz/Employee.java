package com.bridgelabz;

public class Employee {
	
	
	
	public static void employeecheck( Employee check ) {  
		final int IS_FULLTIME = 1;
		
		System.out.println("Welcome To Employee Wage Computation Program");
		
 	   
 		 	 final int empcheck =((int) Math.floor(Math.random() * 10) % 2);
 		 	if ( empcheck == IS_FULLTIME ) 
 		       System.out.println("Employee is Present");
 		 	
 		 	
 		 else {
 		       System.out.println("Employee is Abscent");
 		 	}
            
	} 
	  
     
}