package com;

public class Test {

	public static void main(String[] args) {
		
		// set content to private properties only through methods : setters
		// read back data from object properties only though methods: getters
		
		Employee e1=new Employee();
		e1.setEmpId(10);
		e1.setEmpName("Praveen");
		e1.setSalary(38384);
		//e1.salary=97439;
		
		
		System.out.println(e1);
		
		
		/*
		System.out.println(e1.getEmpId());
		System.out.println(e1.getEmpName());
		System.out.println(e1.getSalary());
		//System.out.println(e1.salary);
		 */
		
		
		
		
		
		

	}

}
