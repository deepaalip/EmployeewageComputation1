package com.bridgelabz;

public class Employee {
	public static final int IS_FULLTIME = 1;
	public static final int IS_PARTTIME = 2;
	 
	
	private final String company;
	private final int EMP_RATE_PER_HOUR;
	private final int NO_OF_WORKING_DAYS ;
	private final int max_hrs_per_month ;
	private int totalempwage;
	
	public Employee (String company, int EMP_RATE_PER_HOUR, int NO_OF_WORKING_DAYS, int max_hrs_per_month){
		
			this.company = company;
			this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
			this.NO_OF_WORKING_DAYS = NO_OF_WORKING_DAYS;
			this.max_hrs_per_month = max_hrs_per_month;
		}
		
		private void computation_of_employee_wage(){
	     int emphrs = 0;
	     int empwage = 0;
	    int total_emp_hrs = 0;
	    int num_of_days = 0;
		System.out.println("Welcome To Employee Wage Computation Program");
		
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
 		 	
	} 
		@ Override
		public String toString() {
			return "Total Emp Wage for the company : "+company+ " is " + totalempwage;
		}
	  public static void main(String[] args) {
		  Employee Dmart= new Employee ("Dmart",20,2,10);
		  Employee Bigbasket= new Employee("Bigbasket",30,2,10);
		 Dmart.computation_of_employee_wage();
		 System.out.println(Dmart);
         Bigbasket.computation_of_employee_wage();
         System.out.println(Bigbasket);
	
}	
}
	
     
