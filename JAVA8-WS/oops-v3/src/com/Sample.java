package com;

public class Sample {

	
	void  f1(Integer i) {
		System.out.println("Integer: "+i);
	}
	
	
	void  f1(Long i) {
		System.out.println("Integer: "+i);
	}
	
	
	public static void main(String[] args) {
		
		//Sample s=new Sample();
		//s.f1(868);
		
		int x=9; // can't store 8 and 9 prefix with zero
		System.out.println(x);
		
		//int i=009;
		//System.out.println(i);
		
		int i=10;
		//i=i+1;
		i+=3; 
		System.out.println(i);
		
		byte b=10; // 1 byte : 127
		
		//b=b+100000; // invalid
		b+=1; // valid
		System.out.println(b);
		
		
		
	}

}
