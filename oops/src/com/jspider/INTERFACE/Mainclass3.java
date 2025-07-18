package com.jspider.INTERFACE;
interface Alpha{
	void help();
}
interface  Beta {
	void push() ;
	
		
	}
class Gamma implements Alpha,Beta
{
	@Override
	public void help() {
	System.out.println("Executing help.."); 
	
		// TODO Auto-generated method stub

	}
	@Override
	public void push() {
		System.out.println("Executing push...");
	
	}
	
	
}

public class Mainclass3 {
	public static void main(String[] args) {
	Gamma ref= new Gamma();
	ref.help();
	ref.push();
	}
	

}
