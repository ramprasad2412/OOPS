package com.jspider.ABSTARCTION;
abstract class A{

	abstract void read();

	
	
}
abstract class B extends A{
	abstract void write();
	
}
class C extends B
{
	@Override
	void read() {
		System.out.println("Executing read....");
		
	}
	@Override
	void write() {
		System.out.println("Executing the write..");
		
	}
}

public class Mainclass4 {
	public static void main(String[] args) {
		B obj  =new C();
		C ref=  (C) obj;
		obj.write();
		ref.write();
		ref.read();
	}

}
