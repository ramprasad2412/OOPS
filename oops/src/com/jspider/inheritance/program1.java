package com.jspider.inheritance;

class Demo{
	int val=100;
	void test() 
	{
		System.out.println("Executing the classs");
	}
}
	class Sample extends Demo{
		
	}



public class program1 {

	public static void main(String[] args) {
		Sample ref= new Sample();
		System.out.println(ref.val);
		ref.test();
	}
}
		// TODO Auto-generated method stub

	





