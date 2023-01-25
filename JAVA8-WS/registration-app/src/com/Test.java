package com;

public class Test {

	public static void main(String[] args) {
	
		Student s1=new Student(10, "Praveen", "abc@abc.com", 76);
		System.out.println("main: hashcode of s1: "+s1.hashCode());
		
		s1.registration(); // who is calling this method? : s1 (student object::=> this)
		
	
		
		
		
	}

}
