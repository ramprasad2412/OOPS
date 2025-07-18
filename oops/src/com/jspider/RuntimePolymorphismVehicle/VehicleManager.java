package com.jspider.RuntimePolymorphismVehicle;

public class VehicleManager {
	static void StimulateDriving(Vehicle v) {
		if(v!= null) {
			v.drive();
		}
	}

}
