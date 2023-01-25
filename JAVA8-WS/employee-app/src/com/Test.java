package com;

public class Test {

	public static void main(String[] args) {
		
		Department d1=new Department(10, "IT");
		Department d2=new Department(20, "Accounts");
		
		Employee e1=new Employee(1, "Praveen", 9474434);
		e1.setDept(d1);
		
		//System.out.println(e1);
		Employee.display(e1);
		
		
		
		
		
		

	}

}
