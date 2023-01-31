package com;
class Calculator{
	int x;
	public void calculate() {
		System.out.println(x);
	}
}
class Square extends Calculator{
	@Override
	public void calculate() {
		x=10;
		System.out.println(x*x);
	}
}

class Sum extends Calculator{
	
}


public class PolyDemo {

	public static void main(String[] args) {
		Calculator c=new Square();
		c.calculate();
		c=new Sum();
		c.calculate();

	}

}
