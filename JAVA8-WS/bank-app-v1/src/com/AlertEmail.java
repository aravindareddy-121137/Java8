package com;

public class AlertEmail implements Notification{
	
	@Override
	public void notify(double balance) {
		System.out.println("email has sent");
		System.out.println("the remaning balance is "+balance);
		
	}
	

}
