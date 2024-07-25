package com.oops;

public class Person {
	//instance variable(data fields)
	String name;
	int age;
	String gender;
	double height;
	double weight;
	
	//static variable
	static int numofpersons=0;
	
	//constructor
	public Person(String name,int age,String gender,double height,double weight) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.height=height;
		this.weight=weight;
		numofpersons++; //increment count of person by 1 at time
	}
	
    //method->instance method
	public void getpersondetails() {
		//local variable->created in method
		String persondetails="Name : "+name+",Age : "+age+",Gender : "+gender+",+Height+ : "+height+",Weight : "+weight+"kg";
		System.out.println(persondetails);
			
	}
	
	//main method
	public static void main(String[] args) {
		// create person object
		Person person1=new Person("Bhanu",25,"Female",5.15,46.5);
		Person person2=new Person("Rekha",26,"Female",5.20,48.0);
		
		//access person method getpersondetails();
		person1. getpersondetails();
		person2.getpersondetails();
		
		//tell me how many person are added so far?
		System.out.println("total number of people" +Person.numofpersons);
	}

}
