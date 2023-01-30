package com;
class ReserveBank{
	public void guideLines() {
		System.out.println("1.");
		System.out.println("2.");
	}
	
}

class Sbi extends ReserveBank{
	//Sbi sbi=new Sbi();
	public void custInfo() {
		//sbi.guideLines(); // can access super class data
	}
	
}
class Hdfc extends ReserveBank{}
class Icici extends ReserveBank{}

public class BankDemo {

	public static void main(String[] args) {
		ReserveBank rb=new Sbi();
		rb.guideLines();
		//rb.custInfo();// invalid
		rb=new Icici();
		rb.guideLines();
		rb=new Hdfc();
		rb.guideLines();
		

	}

}
