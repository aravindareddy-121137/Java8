package com;
final class Formula{
	
	public void myOwnhashCodeLogic() {
		// my  own hashcode algoritham impl
	}
	// so methods
	public void fm() {
		
	}
	
}


//class CDemo extends Formula{} // invalid

class Fruit{
	private int fruitID;
	final int ID=97866;
	
	
	public void f1() {
		// logic 
	}
	void f2() {} // default 
	protected void f3() {
		f4();
	}
	
	private void f4() {}
	public final void f5() {
		// logic 
	} // can not be overridden i
}

class Mango extends Fruit{
	
	@Override
	public void f1() { // only public works
	 // mango logic
	}
	
	@Override
	void f2() { } // public, default and protected works
	
	@Override
	protected void f3() { // public and protected works
	}
	
	//@Override
	//public void f5() {}
}




public class OverRideDemo {
	
	public static void main(String[] args) {
		
		Formula ff=new Formula();
		Integer i;
		
		ff.fm();
		
		Fruit f=new Mango();
		f.f5(); // valid
		//f.f
	}

}
