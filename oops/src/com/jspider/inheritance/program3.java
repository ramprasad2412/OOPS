package com.jspider.inheritance;
class WhatsApp1{
	void message() {
		System.out.println("Sending the mesage");
		
	}
}
class WhatsApp2 extends WhatsApp1{
	void call() {
		System.out.println("Call in whatsApp");
		
	}
}
class WhatsApp3 extends WhatsApp2{
	void status() {
		System.out.println("Ststus in WahtsApp");
		
	}
}

public class program3 {

	public static void main(String[] args) {
		WhatsApp3 ref= new WhatsApp3() ;
			ref.message();
			ref.call();
			ref.status();
		}
	}
			
		
		// TODO Auto-generated method stub

	


