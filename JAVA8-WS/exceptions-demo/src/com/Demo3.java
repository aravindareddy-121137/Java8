package com;

public class Demo3 {
	
	public static void main(String[] args) {
		
		int age=8;
		
		try {
			
			if(age<=22) {
				throw new Exception(); // takes you to catch block
			}
			System.out.println("welcome");
			
		}catch(Exception e) {
			System.out.println("Under age..."+e);
		}
		
		
		
	}

}
