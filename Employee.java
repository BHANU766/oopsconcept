package com.oops;

public class Employee {
	
    //instance variable(data fields)
	String name;
	int age;
	String position;
	double salary;
	
	//constructor
	public Employee(String name,int age,String position,double salary) {
		this.name=name;
		this.age=age;
		this.position=position;
		this.salary=salary;
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", position=" + position + ", salary=" + salary + "]";
	}






	public static void main(String[] args) {
		//create employee object
		Employee emp1=new Employee("Bhanu",25,"sr.developer",200000.00);
		Employee emp2=new Employee("Rekha",26,"sr.manager",300000.00);
		
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		
		Company.addemployee(emp1);
		Company.addemployee(emp2);
		
		System.out.println("total employee :"+Company.noofemp);

	}

	

}
