package com.jspider.DOWNCASTING;
class Demo
{
	
}
class Sample extends Demo
{
	
		
}


public class MainClass1 {
	public static void main(String args[]) {
		Demo ref= new Sample();
		Sample obj=(Sample)ref;
		System.out.println(ref);
		System.out.println(obj);
		
	}


}
