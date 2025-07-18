package com.jspider.RuntimePolymorphismVehicle;

public class Mainclass {
	public static void main(String[] args) {
		Car c= new Car();
		VehicleManager.StimulateDriving(c);
		Bike b= new Bike();
		VehicleManager.StimulateDriving(b);
		
		
	}

} 
