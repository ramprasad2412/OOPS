package com.jspider.Innerclass;
class Demo{
	static class Sample{
		void test() {
			System.out.println("Executing the test().............");
		}
	}
}

public class Mainclass1 {
	public static void main(String[] args) {
		Demo.Sample ref;
		ref=new Demo.Sample();
		ref.test();
	}

}
