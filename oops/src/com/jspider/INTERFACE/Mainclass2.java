package com.jspider.INTERFACE;
interface Delta{
	int val =100;// public static final int val =100;
	void play() ;//public static void disp
		
		}
class Example implements Delta{
	
	@Override
	public void play() {
		System.out.println("Executing  play()....");
		
	}
}


public class Mainclass2 {
	public static void main(String[] args) {
		Delta d = new Example();
		d.play();
	}
}
		
	