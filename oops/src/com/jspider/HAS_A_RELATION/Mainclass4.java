package com.jspider.HAS_A_RELATION;
class Camera{
	void selfie() {
		System.out.println("Taking the photo  ");
		
	}
}
class Simcard{
	void call() {
		System.out.println("making call6");
		
	}
}
class Mobile{
	Camera cam = new Camera();//Mobile has a camera :Composition
	Simcard sim;// Mobile - has - a Simcard :Aggregation9
	Mobile(Simcard sim){
		this.sim= sim;
		
	}
}

public class Mainclass4 {
	public static void main(String[] args) {
		Simcard sim= new Simcard();
		Mobile mob= new Mobile(sim);
		mob.cam.selfie();
		mob.sim.call();
	}
	

}
