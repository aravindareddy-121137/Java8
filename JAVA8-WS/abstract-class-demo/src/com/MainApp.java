package com;

public class MainApp {
	
	public static void main(String[] args) {
		AbstractDemo a=new C2();
		a.f1();
		a.f2(); //always c1 class f2
		a.f3();
		
		// need only v1 version methods
	
		Employee re=new RegularEmployee();
		re.acceptData(100, "Abc", "Regular");
		re.processSalary();
		Employee.display(re);
		
		Employee ce=new ContractEmployee();
		ce.acceptData(101, "Xyz", "Contract");
		ce.processSalary();
		Employee.display(ce);
		
	}

}
