package com.jspider.METHODOVERIDING;
class TestEngineer{
	void test() {
		System.out.println("Manual Testing");
	}
}
class AutomationTestEngineer extends TestEngineer{
	@Override
	
	void test() {
		System.out.println("Automation Testing");
	}
}

public class Mainclass9 {
	public static void main(String[] args) {
		TestEngineer qa= new TestEngineer();
		qa.test();
		AutomationTestEngineer sdet= new AutomationTestEngineer();
		sdet.test();
		TestEngineer te= new AutomationTestEngineer();
		te.test();
		
		
	}

}
