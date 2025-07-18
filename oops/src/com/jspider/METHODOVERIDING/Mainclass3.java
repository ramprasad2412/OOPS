package com.jspider.METHODOVERIDING;

import com.jspider.encapsulation.mainclass1;

class Demo{
	void play() {
		System.out.println("E^sjksdnsk");
	}
}
class Sample extends Demo{
	void play() {
		System.out.println("IHWiushak");
		
	}
}

public class Mainclass3 {
	public static void main(String[] args) {
		System.out.println("12wr4568uehsfkjehsdkj.ndkjn");
		Demo d= new Demo();
		d.play();
		Sample s= new Sample();
		s.play();
		Demo obj= new Sample();//upcasting
		obj.play();
		Sample ref=(Sample) obj;// down casting
		ref.play();
		
	}
	

}
