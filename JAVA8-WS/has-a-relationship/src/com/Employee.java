package com;
public class Employee {
	
    int empId;  // default
	String empName;
	double salary;
	
	// has 'A'

	Department dept; // forward declaration or ref of a class
	Project proj;
	Address addr; // ref of a class 'Address'

	 Employee(int empId, String empName, double salary, Department dept,Project proj) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.dept = dept;
		this.proj=proj;
	}
	
	
	    void display() {
		System.out.println("ID: "+empId);
		System.out.println("Name: "+empName);
		System.out.println("Salary: "+salary);
		System.out.println("Dept ID: "+dept.deptId);
		System.out.println("Dept Name: "+dept.deptName);
		System.out.println("Dept Location: "+dept.location);
		System.out.println("Project ID: "+proj.projectId);
		System.out.println("Project Name: "+proj.projectName);
		System.out.println("Project Account: "+proj.accountName);
		System.out.println("----------------------------------------");
		
	}
	
	
	
	
	
	
	
	
	
	

}
