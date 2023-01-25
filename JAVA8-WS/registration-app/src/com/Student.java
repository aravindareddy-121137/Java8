package com;

public class Student {
	private int studentId;
	private String studentName;
	private String emailAddress;
	private int age;
	private String result;

	public Student(int studentId, String studentName, String emailAddress, int age) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.emailAddress = emailAddress;
		this.age = age;
	}
	
	public void registration() {
		
		System.out.println("registration: hashcode called by: "+this.hashCode());

		
		// 1. register for entrance test
		
		Registar r=new Registar(); // r gets created with new hashcode
		System.out.println("registration:: Registar hashcode: "+r.hashCode());
		
		r.registerForExam(this); // this s1 object ( the object who is calling 'registerForExam' method)
		
		// 2. get test results
		// 3. generate admission id if test result is 'pass'
	}
	
	
	

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", emailAddress=" + emailAddress
				+ ", age=" + age + "]";
	}

}
