package com.jspider.Enumeration;

import com.jspider.ENCAPSUALTIONGROOMING.Mainclass1.Main;

enum Bike{
	TVS ,KTM ,BAJAJ,DUCATI ,BMW,HERO,HONDA,ROYALENFIELD;
	
}

public class Program3 {
	public static void main(String[] args) {
		Bike val=Bike.BAJAJ ;
		switch(val) {
		case TVS:System.out.println("The tvs head qaurter i sin chennai");
		break;
		case KTM:System.out.println("The tvs head qaurter i sin chennai");
		break;
		case BAJAJ:System.out.println("The tvs head qaurter i sin chennai");
		break;
		case BMW:System.out.println("The tvs head qaurter i sin chennai");
		break;
		case DUCATI:System.out.println("The tvs head qaurter i sin chennai");
		break;
		}
	}
	

}
