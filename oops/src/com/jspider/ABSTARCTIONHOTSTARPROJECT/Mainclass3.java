package com.jspider.ABSTARCTIONHOTSTARPROJECT;

public class Mainclass3 {
	public static void main(String[] args) {
		HomepageTest ht= new HomepageTest();
	     Testmanager.testEngine(ht);
	     profilepagetest pt= new  profilepagetest();
	     Testmanager.testEngine(pt);
	     Settingpagetest st= new Settingpagetest();
	     Testmanager.testEngine(st);
		
		
	}

}
