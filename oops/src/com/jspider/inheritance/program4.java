package com.jspider.inheritance;
class Freeversion{
	void read() {
		System.out.println("read()........");
	}
}
class Paidversion extends Freeversion{
	void write() {
		System.out.println("Write().....");
	}
	void edist() {
		System.out.println("Edit().......");
	}
}


public class program4 {

	public static void main(String[] args) {
		Paidversion ref= new Paidversion();
		ref.edist();
		ref.read();
		ref.write();
		// TODO Auto-generated method stub

	}

}
