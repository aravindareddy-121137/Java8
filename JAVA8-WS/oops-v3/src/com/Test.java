package com;

public class Test {
	
	/*
	void f1(int x) { // 4 bytes
		System.out.println("Integer: "+x);
	}
	*/
	
	
/*
	void f1(float x) { // 4 bytes
		System.out.println("Float: "+x);
	}
	
	*/
	
	/*
	void f1(short x) { // 2 bytes
		System.out.println("Short: "+x);
	}
	*/
	
	/*
	void f1(long x) { // 8 bytes
		System.out.println("Long: "+x);
	}
	*/
	
	
	void f1(double x) { // 8 bytes
		System.out.println("Double: "+x);
	}
	
	/*
	void f1(byte x) {
		System.out.println("Byte: "+x);
	}
	*/
	void f1(char x) {
		System.out.println("Char: "+x);
	}

	public static void main(String[] args) {
		
		Test d=new Test();
		
		var r="Praveen";
		
		System.out.println(r);
		
		
		//d.f1(34); // int  
		//d.f1(877); // when int type not matching, next size of int is long
		//d.f1(734); // float type
		//d.f1(734); // double
		
		// d.f1(343); // invalid
		
		//d.f1((byte)45); // 1 byte  : byte
		//d.f1((byte)45); // 2 bytes : short
		//d.f1((byte)45);
		 //d.f1(443);
		
		 //d.f1(33);
		
		

	}

}
