package com;

import java.io.IOException;

public class Demo {

	public static void main(String[] args) {
		

		try {
		System.out.println("line 1");
		int x[]= new int[1];
		x[0]=988;
		
		}catch(ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e ) {
			System.out.println("failed due to "+e);
			// logic to to failure..
		}finally {
			System.out.println("line 2");
		}
		
		

	}

}
