package com;

public class Employee {
	
	int id;
	String name;
	double salary;
	
	Employee(int id){ // id is local variable to constructor
	    this.id=id;
	}
	
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	
	
	
	/*
	 * constructor
	 * ---------------
	 * -> its a special class block which invokes when the object of the class gets created
	 * 
	 * -> constructor name and class name must be same
	 * -> constructor must not return any value, including void
	 * -> constructor may or may not have arguments
	 * -> constructor with out any arguments is called default constructor
	 * -> constructor with 1 or more arguments is called argument constructor
	 * 
	 * 
	 *  notes
	 *  --------
	 *  1.providing default constructor is optional
	 *  2.JVM adds its own default constructor when you are not providing default constructor
	 *  3.JVM never adds default constructor when you provide argument based constructor
	 * 
	 * 
	 *  why constructors are needed in java
	 *  ------------------------------------------
	 *  -> when you want provide any default values for instance variables when the object is created.
	 *  -> when you want to restrict any class variable initialization, you must use argument based constructor
	 */
	
	public static void main(String[] args) {
		
		Employee e1=new Employee(19,"Praveen",76);
		Employee e2=new Employee(43,"James",855);
		
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.salary);
		
		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println(e2.salary);
		
		
	}

}
