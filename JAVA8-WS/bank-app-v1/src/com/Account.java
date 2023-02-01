package com;

import java.util.ArrayList;
import java.util.List;

public class Account{ // loosely
	
	private int balance;
	
	private List<Notification> notifications=new ArrayList<>();


	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public List<Notification> getNotifications() {
		return notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	public void withDraw(double amount) {
		balance-=amount;
		
		if(notifications!=null) {
			
			//notifications.forEach(notification->notification.notify());
		
			for(Notification notification:notifications) {
				notification.notify(checkBalance());
			}
		}
	}
	
	public void deposit(double amount) {
		balance+=amount;
		if(notifications!=null) {
			for(Notification notification:notifications) {
				notification.notify(checkBalance());
			}
		}
	}
	
	public double checkBalance() {
		return balance;
	}
	

	

}
