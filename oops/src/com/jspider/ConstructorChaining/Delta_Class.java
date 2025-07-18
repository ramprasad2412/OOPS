package com.jspider.ConstructorChaining;
class Delta{
	Delta(){
		System.out.println("Delta constructor");
	}
	Delta (int a){
		this();
		System.out.println("Delta int constructor");
	}
}
class Example extends Delta {
	Example(){
		super(10);
		System.out.println("Example const");
		
	}
	Example(int a){
		this();
		System.out.println("Example int const");
	}
}
	

public class Delta_Class {
	public static void main(String[] args) {
		Example ex= new Example(24);
	}

}
