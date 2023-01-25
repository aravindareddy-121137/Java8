package com;

public class Employee {

	private int id;
	private String name;
	private double salary;
	private Department dept;
	

	public Employee() {
	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	public static void display(Employee emp) {
		System.out.println("EmpID: "+emp.getId());
		System.out.println("Name: "+emp.getName());
		System.out.println("Salary: "+emp.getSalary());
		System.out.println("Dept ID: "+emp.getDept().getDeptId());
		System.out.println("Dept Name: "+emp.getDept().getDeptName());
		System.out.println("---------------------------------------------");
		
	}

	
	
}
