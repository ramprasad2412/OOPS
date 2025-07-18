package com.jspider.ABSTARCTIONHOTSTARPROJECT;

public class Testmanager {
	static void testEngine(TestScript t) {
		if(t!=null) {
			t.test();
			t.report();
		}
		
	}

}
