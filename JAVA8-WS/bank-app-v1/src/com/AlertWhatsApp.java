package com;

public class AlertWhatsApp implements Notification {
	
	@Override
	public void notify(double balance) {
		System.out.println("whatapp message has sent");
		System.out.println("the remaning balance is "+balance);
		
	}

}
