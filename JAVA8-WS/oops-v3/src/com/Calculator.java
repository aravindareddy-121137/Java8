package com;

public class Calculator {
	
	/*
	 *  polymorphism
	 *  ----------------
	 *  1.static: method overloading : compiler time
	 *  2.dynamic: method overriding : runtime
	 *  
	 *  method overloading
	 *  -----------------------
	 *  -> same method name with different signature
	 *  signature
	 *  ------------
	 *  	-> number of arguments
	 *  	-> type of arguments
	 *  	-> position of arguments
	 *  
	 * 
	 * 
	 */
	
	
	
	 //void test() {}
	 //int test() {} // invalid
	
	 void f1() {
		 System.out.println("-- f1 method");
	 }
	 
	 void f1(int x) {
		 System.out.println("-- f1 method");
	 }
	 
	 void f1(int x,int y) {}
	 void f1(int x,float f) {}
	 void f1(float x,int y) {}
	 
	 
	 
	
	
	public static void main(String[] args) {
		
		System.out.println();
		
	}
	
	
	
	

}
