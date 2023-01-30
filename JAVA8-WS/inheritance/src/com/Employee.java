package com;


public class Employee {
	
	private int empId;
	private String empName;
	private double salary;
	private String empType;
	
	
	public void acceptData(int empId,String empName,String empType) {
		
	}
	
	
	public void processSalary() {
		
	}
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getEmpType() {
		return empType;
	}
	public void setEmpType(String empType) {
		this.empType = empType;
	}
	public static void display(Employee emp) {
		System.out.println("Employee ID: "+emp.getEmpId());
		System.out.println("Employee Name: "+emp.getEmpName());
		System.out.println("Employee Type: "+emp.getEmpType());
		System.out.println("Salary: "+emp.getSalary());
	}
	
    
	

}
