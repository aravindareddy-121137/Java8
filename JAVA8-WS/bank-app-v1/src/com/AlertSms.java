package com;

public class AlertSms implements Notification{

	@Override
	public void notify(double balance) {
		System.out.println("sms has sent");
		System.out.println("the remaning balance is "+balance);
		
	}
}
