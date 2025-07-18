package com.jspider.ABSTARCTIONHOTSTARPROJECT;

abstract class TestScript {
	
	
	abstract void test();
	
	void report() {
		System.out.println("Sending the report");
	}

}
class HomepageTest extends TestScript{
	@Override
	void test() {
		System.out.println("Executin the home page test");
	}
}
class profilepagetest extends TestScript{
	@Override
	void test() {
		System.out.println("Executin the profilepagetest test");
		
	}
}
class Settingpagetest extends TestScript{
	@Override
	void test() {
		System.out.println("Executin theSettingpagetes test");
	}
}
