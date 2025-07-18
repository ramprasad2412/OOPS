package com.jspider.ABSTARCTION;
abstract  class  Demo{
	abstract void test();
	abstract void disp();
	
		
	}
class Sample extends Demo{
	@Override
	void test() {
		System.out.println("executing test()...");
		
	}
	@Override
	void disp() {
		System.out.println("Executing the demo()..");
		
	}
	
}

public class Mainclass1 {
	public static void main(String[] args) {
		Demo d= new Sample();//upcating 
		d.disp();
		d.test();
		
	}

}
