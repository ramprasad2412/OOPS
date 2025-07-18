package com.jspider.METHODOVERIDING;
class Alpha{
	void Display() {
		System.out.println("Black and White display");
	}
}
class Beta extends Alpha{
	@Override
	void Display() {
		System.out.println("Color Display");
	}
}

public class Mainclass4 {
	public static void main(String[] args) {
		Alpha a = new Alpha();
		a.Display();
		Beta b= new Beta();
		b.Display();
		Alpha ref= new Beta();// upcasting
		ref.Display();
	}

}
