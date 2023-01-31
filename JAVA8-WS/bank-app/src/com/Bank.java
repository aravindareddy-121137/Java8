package com;

public class Bank implements Customer,BankEmployee, Manager{
	
	@Override
	public void withDraw() {
		System.out.println("withdrawing");
	}
	
	@Override
	public void deposit() {
		System.out.println("depositing...");
	}
	
	@Override
	public void openAccount() {
		System.out.println("openimg account");
	}
	
	@Override
	public void closeAccount() {
		System.out.println("close account");
	}
	
	@Override
	public void netBank() { // Manager
		System.out.println("net banking access provided");
	}
	
	@Override
	public void lockerAcess() { // Manager
		System.out.println("locker access has given");
	}
	
	
	
	
	
	
	
	
	
	

}
