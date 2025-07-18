package com.jspider.ABSTARCTION;
abstract class Delta{
	void send() {
		System.out.println("Exectuting the send()..");
		
	}
	void run() {
		System.out.println("Executing thr run...");
	}
	
}
class example extends Delta
{
	
	
}

public class Mainclass3 {
	public static void main(String[] args) {
		Delta d= new example();
		d.send();
		d.run();
		
	}

}
