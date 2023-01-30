package com;

class Task{
	public void level1() {}
	public void level2() {}
	public void level3() {}
	public void f1() {}
}

class JP extends Task{
	 public void f1() {} 
	 // level1
}
class SP extends Task{
	// level1 and level 2
}
class PM extends Task{
	// all methods from Task
}

public class Programmer{
	
	public static void main(String[] args) {
		
		JP jp=new JP();
		jp.level3(); // bad
		
		Object obj=new String();
		Object o2=new JP();
		Object o3=new Employee();
		
		//Task t=new Employee(); // invalid
		Task t=new Task(); // have access only to Task class
		JP jpObj=new JP(); // have access Task as well JP  classes
		jpObj.level3();// I wanted to hide.
		//=========================================
		Task t1=new JP(); // valid
		     t1.f1();
		Task t2=new SP(); // valid
		Task t3=new PM(); // valid
		//JP jpObj1 = new Task(); // Compiler error. can be compiled by type casting
		
		System.out.println("Its working...");
		
	}

}
