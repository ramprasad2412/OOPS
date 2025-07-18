package com.jspider.UPCASTING;

public class Main {

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
