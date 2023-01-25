package com;

public class Registar {
	
	public void registerForExam(Student student) {
		System.out.println("registerForExam method called by "+this.hashCode()); // this means who ever called 'registerForExam' method 
		System.out.println("registerForExam:: hashcode by ::  "+student.hashCode());
	}

}
