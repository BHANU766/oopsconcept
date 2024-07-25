package com.oops;

public class Company {
    //static number of emp
	static int noofemp=0;
	
	
	//add an employee to company
	public static void addemployee(Employee employee) {
		noofemp++;
		System.out.println("employee added :"+employee.name);
		
	}
	
	
}
