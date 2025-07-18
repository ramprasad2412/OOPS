package com.jspider.METHODOVERIDING;
class Windows10{
	void start() {
		System.out.println("list view");
	}
	
}
class Windows11 extends Windows10{
	void start() {
		System.out.println("Window view ");
	}
	
}

public class Mainclass8 {
	public static void main(String[] args) {
		Windows10 ref= new Windows10();
		ref.start();
		Windows11 obj = new Windows11();
		obj.start();
		Windows10 win= new Windows11();
		win.start();
		
	}

}
