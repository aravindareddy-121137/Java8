package com;

public class CallByValueDemo {
	
	 void f1(int x) { // x is called formal argument
		 x=x+200;
		 System.out.println("Inside the f1 method X: "+x);
	 }
	
	public static void main(String[] args) {
		
		int x=100; 
		CallByValueDemo obj=new CallByValueDemo();
		System.out.println("Before the call X: "+x);
		obj.f1(x); // here x is actual argument
		System.out.println("After the call X: "+x);
		
		
		
		
		
		
	}

}
