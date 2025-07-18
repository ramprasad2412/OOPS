package com.jspider.inheritance;
class Script1{
	void test() {
		System.out.println("test......");
	}
}
class Script2 extends Script1{
	void report() {
		System.out.println("Report.......");
		
	}
	
}

public class program5 {
public static void main(String[] args) {
	Script2 ref= new Script2();
	ref.test();
	ref.report();
	
}
}
