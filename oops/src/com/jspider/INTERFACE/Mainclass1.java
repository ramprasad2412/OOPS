package com.jspider.INTERFACE;
interface Demo{
	void test() ;// public static void test
	void disp() ;//public static void disp
		
		}
class Sample implements Demo{
	@Override
	public void test() {
		System.out.println("Executing the test...");
		
	
	}
	@Override
	public void disp() {
		System.out.println("Executing the disp....");
		
	}
}

public class Mainclass1 {
	public static void main(String[] args) {
		Demo ref= new Sample();
		ref.disp();
		ref.test();
	}

}
