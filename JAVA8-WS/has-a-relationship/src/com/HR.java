package com;

public class HR {
	
	public static void main(String[] args) {
		
		Department dept=new Department();
		dept.deptId=1111;
		dept.deptName="IT";
		dept.location="Hyderabad";
		
		Project proj=new Project();
		proj.projectId=9379374934L;
		proj.projectName="Ford";
		proj.accountName="NONT";
		
		
		
		
		Employee emp=new Employee(10,"Praveen",947444,dept,proj);
		
		emp.display();
		
		
		
		
		
		
		
		
	}

}
