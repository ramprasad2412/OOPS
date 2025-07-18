package com.jspider.ABSTARCTION;
abstract class Alpha{
	abstract void play();
	void help() {// concerete method bna ske hai abstracrt method me
		System.out.println("Executong the help()....");
	}
	
	
	
}
class Beta extends Alpha{
	@Override
	void play() {
		System.out.println("Executing play()..");
	}
}


public class Mainclass2 {

	public static void main(String[] args) {
		Alpha a= new Beta();
		a.help();
		a.play();
		// TODO Auto-generated method stub

	}

}
