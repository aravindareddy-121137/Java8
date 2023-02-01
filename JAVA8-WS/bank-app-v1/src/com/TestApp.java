package com;

public class TestApp {

	public static void main(String[] args) {
		
		Account acc=new Account();
			acc.getNotifications().add(new AlertEmail());
			acc.getNotifications().add(new AlertSms());
			acc.getNotifications().add(new AlertWhatsApp());
			
			acc.deposit(1000);
			acc.withDraw(100);
		
		
		

	}

}
