package com.jspider.intro;
class Mobiles{
	String model;
	double price;
	void call() {
		System.out.println("The model is :"+model);
		System.out.println("The price of Mobile phone is:"+ price);
	}
}

public class Mobile {
	public static void main(String args[]) {
			Mobiles m1= new Mobiles();
			m1.model="2025";
			m1.price=2000000.0;
			m1.call();
			
	}
	

}
