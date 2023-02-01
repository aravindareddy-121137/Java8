package com;

public class UserDefinedExceptionDemo2 {

	public void process(int age) {

	
			if (age <= 22) {
				throw new InvalidAgeExceptionV1();
			}
			System.out.println("Your age is processed..");
		} 

	

}
