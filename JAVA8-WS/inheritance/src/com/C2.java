package com;
class C1{ // java.lang.Object is the super class to all the classes in java
	int id=100;
	void f1() {
		System.out.println("C1 class f1 method");
	}
}

public class C2 extends C1{
	//int id=97;
	
	// c2 class members /data + C1 class members and data

	public static void main(String[] args) {
		C2 c2=new C2();
		c2.id=2000;
		
		
		
		
	}
}
