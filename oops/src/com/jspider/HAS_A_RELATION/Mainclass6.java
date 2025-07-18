package com.jspider.HAS_A_RELATION;
class Printer{
	void print() {
		System.out.println(" Printer is printing");
	}
}
class Computer{
	static Printer out;
	static {
		out= new Printer();
		
	}
	
}
public class Mainclass6 {
	public static void main(String[] args) {
		Computer.out.print();
	}

}
