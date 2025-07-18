package com.jspider.Has_A_Relationship;

class Demo{
	void test() {
		System.out.println("executing the test");
	}
}
class Sample 
{
	Demo ref= new Demo();
	
		
	}


public class Program1 {
	public static void main(String[] args) {
		Sample obj= new Sample();
	obj.ref.test();
	}

}
