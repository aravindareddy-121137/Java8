package com;
// POJO -> plain old java object / Model / Bean
public class Employee {
	
	private int empId;
	private String empName;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}



	// getters and setter methods
	
	/*
	 * -> getters will not have arguments, but will have return type
	 * -> getters are used to make your class 'read only'
	 * -> setters will not have return type, but will have arguments
	 * -> setters are used to make the class updatable
	 * -> every getter and setter should be defined as 'public'
	 */
	
	 // getters
	 //--------------
	 public int getEmpId() {
		 return empId;
	 }
	 
	 public String getEmpName() {
		 return empName;
	 }
	 
	 public double getSalary() {
		 // calculations before returns
		 salary=salary+2000;
		 return salary;
	 }
	 
	 // setters
	 //--------------
	 
	 public void setEmpId(int empId) {
		this.empId=empId; 
	 }
	 
	 public void setEmpName(String empName) {
		 this.empName=empName;
	 }
	 
	 public void setSalary(double salary) {
		 // verify who is setting, from where , what date and time
		 this.salary=salary;
	 }
	 
	 
	 public void myMethod() {
		 // BL
		 // service :: java BL
		 // dao :: java database logics 
		 
	 }

	
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}
	 
	
	
	
     
	
	
	
	

}
