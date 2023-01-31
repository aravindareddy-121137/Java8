package com;

public class TestApp {

	public static void main(String[] args) {
		
		/*
		Bank b=new Bank();
		b.deposit();
		b.withDraw();
		
		b.openAccount();
		b.closeAccount();
		
		*/
		
		Customer cust=new Bank();
		BankEmployee be=new Bank();
		Manager mgr=new Bank();
		
		cust.withDraw();
		cust.deposit();
		
		be.openAccount();
		be.closeAccount();
		
		mgr.netBank();
		mgr.lockerAcess();
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
