package com.p1.e1;

import com.C1;

public class C8 {
	
	 int id=93473947;
	  
	  
	  
	  /*
	   *  Note: class level , you can define
	   *  	-> declarations of any variables / objects
	   *  	-> assignment of objects or variables
	   *    -> Can not use statements like SOP, if, loop .. etc
	   * 
	   * 
	   */
	
	 C1 c1=new C1();
	
	static void blabla() {
		C8 obj=new C8();
		obj.f3();
		//c1.????
	}
	
	protected void f1() {
		
		c1.f3(); // valid
		
		f3();
		
	}
	
	void f2() { // default
		
	}
	
	public void f3() {
		System.out.println("public f3 method :: C8");
		
		// security ::: 
		
		f4(); // f4 can be invoked from any method of C8 class
	}
	
	private void f4() {
		System.out.println("private f4 method :: C8");
	}

}
