package com;

public class Demo {
	
	void f1(int x) {
		System.out.println("Integer: "+x);
	}
	void f1(float x) {
		System.out.println("Float: "+x);
	}
	void f1(short x) {
		System.out.println("Short: "+x);
	}
	void f1(long x) {
		System.out.println("Long: "+x);
	}
	void f1(double x) {
		System.out.println("Double: "+x);
	}
	void f1(byte x) {
		System.out.println("Byte: "+x);
	}
	void f1(char x) {
		System.out.println("Char: "+x);
	}
	

	public static void main(String[] args) {
		

		Demo d=new Demo();
		d.f1(100); // int
		d.f1(76.43); // double
		d.f1(4344.76f);
		d.f1('J'); // char occupies 2 bytes: Unicode and ascii code
		//System.out.println((int)'b');
		System.out.println((char)66);
		
		d.f1(877);// int
		d.f1(87l); // long
		
		 // note: int : 4 bytes and long : 8 bytes
		
		long l=2147483657l; // int : size : 4 bytes
		//long sdf=87;
		System.out.println(l);
		//System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		 
		float ff=87.43F; // default type of decimal is double
		
		d.f1((short)76);
		d.f1((byte)230); // size of byte: 1 byte: 127 to -128
		
		
		
		
		//float x=(float)765.34;
		
		
	}

}
