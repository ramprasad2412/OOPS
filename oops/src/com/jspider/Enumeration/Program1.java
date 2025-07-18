package com.jspider.Enumeration;
enum WATCH{
	TITAN ,TIMEX,TISSCOT,FOSSIL,ROLEX
	
}

public class Program1 {
	public static void main(String[] args) {
		WATCH val= WATCH.ROLEX;
		switch(val) {
		case TITAN:System.out.println("Cheap and best");
		break;
		case TIMEX:System.out.println("Timeless Classic");
		break;
		case TISSCOT:System.out.println("Entery level luxuxry");
		break;
		case ROLEX:System.out.println("My best Brand");
		break;
		case FOSSIL:System.out.println("modeeratet level luxxry");
		break;
		default:System.out.println("fastrack");
		}
	}

}
