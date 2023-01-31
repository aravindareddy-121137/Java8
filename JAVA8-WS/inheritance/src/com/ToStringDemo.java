package com;

class Person{
	String name;
	// to string ?? 
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nme of person is "+name;
	}
	
}
public class ToStringDemo {
	
	public static void main(String[] args) {
		Person p=new Person();
		p.name="Praveen";
		
		System.out.println(p);
		
	}

}
