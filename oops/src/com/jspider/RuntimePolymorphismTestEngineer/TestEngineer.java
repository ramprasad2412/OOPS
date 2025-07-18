package com.jspider.RuntimePolymorphismTestEngineer;

public class TestEngineer {
	void test() {
		System.out.println("Testing ()......");
		
	}

}
class ManualTestEngineer extends TestEngineer{
	@Override
	void test() {
		System.out.println("Manual testing()..");
		
	}
}
class AutomationTestEngineer extends TestEngineer{
	@Override
	void test() {
		System.out.println("Automation testing()....");
	}
	
}
