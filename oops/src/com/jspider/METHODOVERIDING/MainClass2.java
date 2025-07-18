package com.jspider.METHODOVERIDING;
class Parent{
	void watchTv() {
		System.out.println("serial/news");
	}
}
//@overriding with typecasting
class Child extends Parent{
	
	void watchTv() {
		
	System.out.println("cartooon network /music /sports");
}
}


public class MainClass2 {

	public static void main(String[] args) {
		
		Child c= new Child();
		c.watchTv();
		Parent p = new Child();
		p.watchTv();
		
		// TODO Auto-generated method stub

	}

}
