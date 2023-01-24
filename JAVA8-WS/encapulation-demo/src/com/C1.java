package com;
//import com.p1.*; // not recammended / bad source file 
import com.p1.C3;
import com.p1.C4;
import com.p1.e1.C8;
import com.p2.C5;



public class C1 extends C8{

	public static void main(String[] args) {
		
		C2 c2=new C2();
		C3 c3=new C3();
		C4 c4=new C4();
		C5 c5=new C5();
		//C6 c6=new C6(); invalid coz C6 is defined as 'default' in com.p2 package
		
		C8 c8=new C8();
		c8.f3(); // valid     : f3 is public
		//c8.f2(); // invalid : f2 is default
		//c8.f1(); // invalid : f1 is protected
		//c8.f4(); // invalid : f4 is private
		
		C1 c1=new C1(); // c1 is sub class of C8
		c1.f1(); // valid 
		//c1.f2(); // invalid
		//c1.f3();// valid 
		//c1.f4(); // invalid
		
		
		
		
		
	}

}
