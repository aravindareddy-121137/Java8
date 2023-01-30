package com;

class Sample{
	
	public void f1() {
		System.out.println("Sample class f1 method");
	}
	
}

public class Test extends Sample{
	
	public void f1() {
		System.out.println("Test class f1 method");
	}

	public static void main(String[] args) {
		
		Test t=new Test(); // sub class obj
		t.f1(); // 

	}

}
