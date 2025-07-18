package com.jspider.ConstructorChaining;
class City {
	City(int a){
		System.out.println("New york");
		
	}
	City (double d) {
		this(25);
		System.out.println("London");
	}
	City (String s)
	{
		this(3.4);
		System.out.println("Paris");
		
	}
}

public class Program1 {
public static void main(String args[]) {
	City c1= new City("accd");
	
}
}
