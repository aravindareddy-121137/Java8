package com;

public class UserDefinedExceptionDemo {

	public void process(int age) {

		try {
			if (age <= 22) {
				throw new InvalidAgeException();
			}
			System.out.println("Your age is processed..");
		} catch (InvalidAgeException iae) {

		}

	}

}
