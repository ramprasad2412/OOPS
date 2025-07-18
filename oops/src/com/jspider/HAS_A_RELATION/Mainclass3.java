package com.jspider.HAS_A_RELATION;
class Engine{
	void Power() {
		System.out.println("Engine deliver power");
	}
}
class Driver{
	void Derive() {
		System.out.println(" Driver drivig");
	}
}
class Car{
	Engine eng= new Engine() ;
		Driver dr ;
		Car(Driver dr){
			this.dr= dr;
		}
	}
		
	
	
	

public class Mainclass3 {
	public static void main(String[] args) {
		Driver obj = new Driver();
		Car c= new Car(obj);
		c.dr.Derive();
		c.eng.Power();
	}

}
