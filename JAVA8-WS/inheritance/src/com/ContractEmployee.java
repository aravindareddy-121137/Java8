package com;

public class ContractEmployee extends Employee{
	
	private double noOfHoursWorked;
	private double hourCost;
	
	
	public void acceptData(int empId, String empName, String empType) {
		this.setEmpId(empId);
		this.setEmpName(empName);
		this.setEmpType(empType);
		noOfHoursWorked=35;
		hourCost=670;
	}
	
	
	public void processSalary() {
		this.setSalary(hourCost*noOfHoursWorked);
	}

}
