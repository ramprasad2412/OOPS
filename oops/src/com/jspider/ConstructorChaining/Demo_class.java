package com.jspider.ConstructorChaining;

class Demo {
	Demo() {

		System.out.println("Demo constructor");
	}
}

class Sample extends Demo {
	Sample() {
		//super();
		System.out.println("Sample cnstructor");
	}

}

public class Demo_class {
	public static void main(String[] args) {
		Sample s = new Sample();
	}

}
