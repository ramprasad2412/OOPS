package com.jspider.RuntimePolymorphismVehicle;

public class Vehicle {
	void  drive() {
		System.out.println("Driving Vehicle..");
	}

}
class Car extends Vehicle{
	@Override
	void drive() {
		System.out.println("Driving car..");
	}
}
class Bike extends Vehicle{
	@Override
	void drive() {
		System.out.println("Driving Car..");
	}
}
