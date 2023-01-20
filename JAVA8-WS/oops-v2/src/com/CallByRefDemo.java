package com;

public class CallByRefDemo {
	
	int x; // instance 
	
	void f1(CallByRefDemo obj) { // obj is formal argument
		
		obj.x=5000;
		System.out.println("Inside f1 method X: "+obj.x);
		
	}
	
	public static void main(String[] args) {
		
		CallByRefDemo obj=new CallByRefDemo();
		obj.x=1000;
		System.out.println("Before call X: "+obj.x);
		obj.f1(obj);
		System.out.println("After call X: "+obj.x);
		
		 /*
		  * Objects in java
		  *  
		  *   -> Strings
		  *   -> Arrays 
		  * 
		  * 
		  * 
		  */
		
		
		
		
		
		
		
	}

}
