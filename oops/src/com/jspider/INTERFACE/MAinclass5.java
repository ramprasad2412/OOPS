package com.jspider.INTERFACE;
interface Hat{
	void shade();
	
}
interface Cap extends Hat
{
	void style();
	
}
class Head implements Cap{
	@Override 
	public void shade() {
		System.out.println("Executing the shade");
		
	}
	@Override 
	public void style() {
		System.out.println("Executing the style");
	}
}

public class MAinclass5 {
	public static void main(String[] args) {
		Head ref= new Head();
		ref.shade();
		ref.style();
		
	}
	

}
