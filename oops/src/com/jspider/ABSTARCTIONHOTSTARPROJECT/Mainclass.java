package com.jspider.ABSTARCTIONHOTSTARPROJECT;

public class Mainclass {
	public static void main(String[] args) {
		Hotstar h1= new Hotstarfree();
		AccessControl.display(h1);
		System.out.println(".................");
		Hotstar h2= new HotstarVip();
		AccessControl.display(h2);
		System.out.println(".................");
		
		Hotstar h3= new HotstarPremium();
		AccessControl.display(h3);
		System.out.println(".................");
		
	}

}

