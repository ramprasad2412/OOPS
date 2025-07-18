package com.jspider.METHODOVERIDING;
class AnalogWatch
{ 
	void show(){
		System.out.println("Time ");
	}
	
}
class DigitalWatch extends AnalogWatch
{
	@Override
	void show()
	{
		System.out.println("Date and Time");
	}
}
class SmartWatch extends DigitalWatch
{
	void show() 
	{
		System.out.println("Date ,Time and Notification");
	}
}

public class Mainclass5{
	public static void main(String[] args) {
		AnalogWatch watch = new SmartWatch();//Typecasting //upcasting
		
		watch.show();
		AnalogWatch watchs=new DigitalWatch();
		watchs.show();
		AnalogWatch w= new AnalogWatch ();
		w.show();
		SmartWatch s= new SmartWatch();
		s.show();
		
		
	}

}
