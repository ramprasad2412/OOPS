package com.jspider.ConstructorChaining;
class Food{
	Food(int a ){
		System.out.println("Biryani");
		
	}
	Food (double d){
		this(23);
		System.out.println("Masala Dosa");
	}
	Food(String s){
		this(4.6);
		System.out.println("Litti choka");
			
		}
	}


public class Program2 {
	public static void main(String[] args) {
		Food f1= new Food("ACFF");
	}

}
