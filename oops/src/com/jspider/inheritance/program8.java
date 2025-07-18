package com.jspider.inheritance;
class A{

	void test() 
	{
		System.out.println("Executing test()....");
	}
}
class B extends A
{
	void disp() 
	{
		System.out.println("Executing the disp()....");
	}
}
public class program8{
	public static void main(String[] args) {
	  A ref= new A();
      ref.test();
      B obj = new B();
      obj.test();
      obj.disp();
	}
}
      
      
     
      
      
