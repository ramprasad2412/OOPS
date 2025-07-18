package com.jspider.RuntimePolymorphism;

public class Mainclass2 {
	public static void main (String args[]) {
		MobileAdapter ma= new MobileAdapter();
		AdapterManager.registerAdapter(ma);
		LaptopAdapter la= new LaptopAdapter();
		AdapterManager.registerAdapter(la);
 	}

}
