package com.jspider.inheritance;

import com.jspider.UPCASTINGExample3.Car;

class Vehicle{
	String name;
	int price;
	String color;
	String type;
	Vehicle(String name,int price,String color,String type){
		this.name=name;
		this.type=type;
		this.color=color;
		this.price=price;
	}

	void avgspeed() {
		System.out.println("the avg speed is 80k/hr");
	}
}

	class car extends Vehicle{

		car(String name, int price, String color, String type) {
			super(name, price, color, type);
			
		}
	
		@Override
		 void avgspeed() {
			System.out.println("The speed of car is :20 km");
			
		}
		
}

public class Program9 {
	public static void main(String[] args) {
		Vehicle v= new Vehicle("Pulsar", 12345, "Blue", "twowheeler");
		Vehicle v1= new Vehicle("truck",12345,"red","tenwheeler");
		System.out.println(v.name);
		System.out.println(v.color);
		System.out.println(v.price);
		System.out.println(v.type);
		v.avgspeed();
		
		System.out.println("---------------------------------");
		System.out.println(v1.name);
		System.out.println(v1.color);
		System.out.println(v1.price);
		System.out.println(v1.type);
		v.avgspeed();
		
		System.out.println("-----------------------------------");
		
		car c1= new car("tata",123446,"color","4wheler") ;
		System.out.println(c1.name);
		System.out.println(c1.price);
		System.out.println(c1.color);
		System.out.println(c1.type);
		c1.avgspeed();
	}
}

		
			
	

	


