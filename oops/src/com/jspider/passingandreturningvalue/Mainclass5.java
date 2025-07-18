package com.jspider.passingandreturningvalue;

import java.util.Scanner;

class Car{
	double price;
	double mileage;
	
	Car(double price,double mileage){
		this .mileage= mileage;
		this.price= price;
		
	}
	
}
class CarShop{
	static void  displayCarPropertise(Car c) {
		if(c!=null) {
			System.out.println("price :"+c.price);
			System.out.println("mileage :"+c.mileage);
			
			
		}
	}
	static Car CreateCar() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the price");
		double price= sc.nextDouble();
		System.out.println("Enter the mileage");
		double mileage= sc.nextDouble();
		
		Car c= new Car(price,mileage);
		return c;
				
		
		
		
	}
}

public class Mainclass5 {
	public static void main(String args[]) {
		Car c1= new Car(8.4,14.6);
		CarShop.displayCarPropertise(c1);
		
		Car c2= CarShop.CreateCar();
		CarShop.displayCarPropertise(c2);
		
		
		
		
		
	}

}
