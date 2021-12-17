package com.bridgelabz;

public class Employee {
	public static void employeecheck( Employee check ) {  
		final int IS_FULLTIME = 1;
		final int IS_PARTTIME = 2;
		final int EMP_RATE_PER_HOUR =20;
	     int emphrs = 0;
	     int empwage = 0;
		System.out.println("Welcome To Employee Wage Computation Program");
		
 	   
 		 	 final int empcheck =((int) Math.floor(Math.random() * 10)) % 3;
 		 	switch (empcheck) {
            case IS_FULLTIME:
               emphrs = 8;
               System.out.println("Employee is present");
               break;
            case IS_PARTTIME:
               emphrs = 4;
               break;
            default:
               emphrs = 0;
 	         System.out.println("Employee is Abscent");
           }
 		 	empwage = emphrs * EMP_RATE_PER_HOUR;
 	       System.out.println("Emp Wage: " + empwage);
	} 
}
	
	
	
     
