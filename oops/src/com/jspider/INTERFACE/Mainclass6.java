package com.jspider.INTERFACE;

interface Vehicle {
	void start();
	void stop();
}
class Car implements Vehicle
{
	@Override
	public void start() {
		System.out.println("Starting car");
	}

	@Override
	public void stop() {
		System.out.println("Stoping car");
	}
	
}
class Bike  implements Vehicle 
{
	@Override
	public void start() {
		System.out.println("Starting bike");
	}

	@Override
	public void stop() {
		System.out.println("Stoping  bike");
	}
	
}
class VehicleSimulator{
	static void driveVehicle(Vehicle v ) {
		if(v!=null) {
			v.start();
			v.stop();
		}
	}

public class Mainclass6 {
	public static void main(String[] args) {
		Car c= new Car();
		VehicleSimulator.driveVehicle(c);
		Bike  b= new Bike();
		VehicleSimulator.driveVehicle(c);
		
		
	}
}

}
