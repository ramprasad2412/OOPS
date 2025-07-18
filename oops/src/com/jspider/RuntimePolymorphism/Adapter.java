package com.jspider.RuntimePolymorphism;

public class Adapter {
	void adapt() {
		System.out.println("Finding device");
	}

}
class MobileAdapter extends Adapter{
	@Override
	void adapt() {
	System.out.println("Adapt the mobile");
	}
}
class LaptopAdapter extends Adapter{
	@Override
	void adapt() {
		System.out.println("Adapt the Laptaop");
	}
	
}
	
