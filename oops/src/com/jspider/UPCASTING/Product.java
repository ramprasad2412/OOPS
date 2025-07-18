package com.jspider.UPCASTING;

public class Product {
	

}
 class Mobile extends Product{
	
}
 class Television extends Product{
	 
 }
 class Laptop extends Product{
	 
 }

public class Flipcart {
	static void addToKart(Product p) {
		if(p!=null) {
			System.out.println("product add to cart");
		}
	}


//public class Main {

	public static void main(String[] args) 
	{
		
		Mobile m= new Mobile();
		Television t= new Television();
		Laptop l= new Laptop();
		Flipcart.addToKart(m);//AUTO UPCASTING :MOBILE---->PRODUCT
		Flipcart.addToKart(t);//AUTO UPCASTING :TELEVISION---->PRODUCT
		Flipcart.addToKart(l);//AUTO UPCASTING :LAPTOP---->PRODUCT
		
	

	}

}

