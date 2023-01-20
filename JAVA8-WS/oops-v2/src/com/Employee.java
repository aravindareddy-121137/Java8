package com;

public class Employee {
	int id;
	String name;
	double salary;
	static String mgrName="James";
	
	
	// only static data allowed directly.
	// non static data, object must be needed.
	static void f1() {
		mgrName="Xyz"; // valid
		//id=87; // invalid
		//solution?
		// defined object and access the instance data.
		Employee empObj=new Employee();
		empObj.id=9988;
	}
	
	// both static and non static directly (object not needed)
	void f2() {
		id=100;
		mgrName="Abc";
	}
	
	/*
	 * diff b/w method and function
	 * 	-> they are same
	 * 	-> method must be inside class only
	 *  -> function can be defined outside of class
	 *  
	 *  
	 *  
	 *   JVM - Java virtual machine
	 *   ------------------------------
	 *   1. .class -> Class loader sub system
	 *   2.Class loader sub system allocates nessasary disk space to execute java program
	 *   3. This disk space is called Runtime data areas, and it is divided into 5 parts
	 *   	-> stack
	 *   	-> heap
	 *   	-> method area
	 *   	-> PC registers
	 *   	-> Native method stack
	 *   
	 *       
	 *       
	 *   
	 *   
	 */

	public static void main(String[] args) {
		
		int id=98;
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		
		System.out.println("ID: "+id);
		
		e1.id=10;
		e1.name="Abc";
		e1.salary=1000;
		
		e2.id=11;
		e2.name="Xyz";
		e2.salary=2000;
		
		e3.id=12;
		e3.name="Aaa";
		e3.salary=3000;
		
		
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.salary);
		//System.out.println(e1.mgrName);
		System.out.println(mgrName);
		System.out.println("---------------------");
		
		mgrName="Ozvitha";
		
		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println(e2.salary);
		System.out.println(mgrName);
		System.out.println("---------------------");
		
		System.out.println(e3.id);
		System.out.println(e3.name);
		System.out.println(e3.salary);
		System.out.println(mgrName);
		System.out.println("---------------------");
		
		

	}

}
