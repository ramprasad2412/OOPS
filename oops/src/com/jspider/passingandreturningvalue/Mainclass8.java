package com.jspider.passingandreturningvalue;

import java.util.Scanner;

class Biryani{
	double price;
	int qty;
	Biryani(double price,int qty){
		this.price=price;
		this.qty= qty;
		
	}
}
class Hotel{
	static void greet() {
		System.out.println("Welcome to my hotel");
	}
	static void ShowBiryani(Biryani b) {// static method with arguments 
		if(b!=null ) {
			System.out.println("Enter the price "+b.price);
			System.out.println("Enter the qty:"+b.qty);
			
		}
	}
	static Biryani createBiryani() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the price");
		double price= sc.nextDouble();9
		System.out.println("Enter the qty");
		int qty= sc.nextInt();
		Biryani  b= new Biryani(price,qty);// biryani
		return b;
				
		
	}
}

public class Mainclass8 {
	public static void main(String[] args) {
		Hotel.greet();
		Biryani b1=Hotel.createBiryani();// method call 
		Hotel.ShowBiryani(b1);
		Biryani b2=Hotel.createBiryani();
		Hotel.ShowBiryani(b2);
		
		
	}
}










