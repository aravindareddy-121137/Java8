package com;

public class RegularEmployee extends Employee{
	
	private double noOfDaysWorked;
	private double dayCost;
	
	public void acceptData(int empId, String empName, String empType) {
		this.setEmpId(empId);
		this.setEmpName(empName);
		this.setEmpType(empType);
		noOfDaysWorked=23;
		dayCost=2500;
		
	}
	
	public void processSalary() {
		this.setSalary(dayCost*noOfDaysWorked);
	}
	

}
