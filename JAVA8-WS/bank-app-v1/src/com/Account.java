package com;


public class Account implements Notification {
	
	private int balance;
	
	
	
	public void withDraw(double amount) {
		balance-=amount;
		//System.out.println("account is debited with "+amount);
		sendSms();
	}
	
	public void deposit(double amount) {
		balance+=amount;
		//System.out.println("account is credited with "+amount);
		sendSms();
	}
	
	public void checkBalance() {
		System.out.println("Balance: "+balance);
	}
	
	@Override
	public void sendSms() {
		System.out.println("you account is updated: balance is "+balance);
		
	}
	
	
	

}
