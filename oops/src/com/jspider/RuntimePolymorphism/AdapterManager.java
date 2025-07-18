package com.jspider.RuntimePolymorphism;

public class AdapterManager {
	static void registerAdapter(Adapter a) {
		if(a!= null) {
			a.adapt();
		}
	}

}
