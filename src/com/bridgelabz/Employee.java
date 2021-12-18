package com.bridgelabz;

public class Employee {
	public static final int IS_FULLTIME = 1;
	public static final int IS_PARTTIME = 2;
	
	public static int computation_of_employee_wage (String company, int EMP_RATE_PER_HOUR, int NO_OF_WORKING_DAYS, int max_hrs_per_month){
		
	     int emphrs = 0;
	     int empwage = 0;
	    int total_emp_hrs = 0;
	    int num_of_days = 0;
		System.out.println("Welcome To Employee Wage Computation Program");
		int totalempwage=0;
		while (total_emp_hrs <= max_hrs_per_month && num_of_days < NO_OF_WORKING_DAYS ) {
	         num_of_days++;
 	   
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
		}
 		 	empwage = emphrs * EMP_RATE_PER_HOUR;
 		     totalempwage += empwage;
 		 	System.out.println("Total Emp Wage for the company : "+company+ " is " + totalempwage);
 		 	return totalempwage;
	} 
	  public static void main(String[] args) {
		 int totalwage = computation_of_employee_wage("Dmart",20,2,10);
	  }
  
	
}	
	
     
