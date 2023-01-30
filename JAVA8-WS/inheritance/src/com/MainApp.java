package com;


public class MainApp {

	public static void main(String[] args) {
		
		RegularEmployee re=new RegularEmployee();
		re.acceptData(100, "Abc", "Regular");
		re.processSalary();
		Employee.display(re);
		
		ContractEmployee ce=new ContractEmployee();
		ce.acceptData(101, "Xyz", "Contract");
		ce.processSalary();
		Employee.display(ce);

		
		
		

	}

}
