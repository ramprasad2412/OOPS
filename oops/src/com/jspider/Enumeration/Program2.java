package com.jspider.Enumeration;
enum Day{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
	
}
enum Month{
	JAN,FEB,MARCH,APRIL,MAY,JUNE,JULY ,AUGUST,SEP,OCT,NOV,DEC
	
}

public class Program2 {
	public static void main(String[] args) {
		Month mon= Month.APRIL;
		System.out.println(mon);
		
		Day variable = Day.FRIDAY;
		System.out.println(variable);
	}

}
