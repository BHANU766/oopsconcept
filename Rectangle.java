package com.oops;

public class Rectangle {
	
	//static block->it is part of class
	static {
		System.out.println("this is static block");
	}
	//instance block->it is part of object
	{
		System.out.println("this is a instance block");
			
	}
	
	//constructor->no-parameterized 
	Rectangle(){
		System.out.println("0-argument rectangle constructor");
	}
	
	//constructor->parameterized
	Rectangle(int length,int breadth) {
		System.out.println("2-argument rectangle constructor");
		//initialize length and breadth
		this.length=length;//100;
		this.breadth=breadth;//300;
	}
	
	
	//define data members
	int length,breadth;//has a part
	
	//method-1->instance method
	public int  getperimeter(int length,int breadth) {
		return 2*(length+breadth);
	}	
		
	//method-2->instance method 
	public int getareaofrectangle(int length,int breadth) {
		return length*breadth;
	}
		
	
		
	 
	
	
	
    //main method
	public static void main(String[] args) {
		//reference variable->can be used to refer the object
		Rectangle rc1=new Rectangle();
		Rectangle rc2=new Rectangle(100,300);
		
	//method to calculate perimeter of rectangle
    System.out.println(rc2.getperimeter(10, 20));
    System.out.println(rc2.getareaofrectangle(100,300));
	}

}
