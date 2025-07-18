package com.jspider.ABSTARCTIONHOTSTARPROJECT;

public class AccessControl {
	static void display(Hotstar hs) {
		if(hs!=null) {
			hs.login();
			hs.watch();
		}
	}

}
