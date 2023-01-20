package com;

import java.util.Arrays;

public class ArrayDemo {
	
	static void f1(int dummy[]) {
		System.out.println("Inside f1 method");
		dummy[1]=1000;
		 for(int i:dummy) {
			 System.out.println(i);
		 }
		 System.out.println("--------------------------");
		 
		
	}

	public static void main(String[] args) {
		
		//int x[]=new int[3];
		int x[]= {10,20,30};
		
		ArrayDemo ad=new ArrayDemo();
		System.out.println("Before call to f1 method");
		 for(int num:x) {
			 System.out.println(num);
		 }
		 System.out.println("---------------------");
		
		f1(x);// x is actual argument
		
		System.out.println("After call to f1 method");
		 for(int num:x) {
			 System.out.println(num);
		 }
		 System.out.println("---------------------");
		
		
		
		
		

	}

}
