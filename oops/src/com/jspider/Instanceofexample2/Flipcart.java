package com.jspider.Instanceofexample2;

public class Flipcart 
{
	static void DisplayProductInfo(Product  p) {
		if(p!=null) {
			System.out.println("pid is "+p.pid);
			System.out.println("Price is "+ p.price);
			
			if( p instanceof Mobile) {
				Mobile m=(Mobile)p;
				System.out.println( "Brand is"+m.brand);
				System.out.println("Ram is"+ m.ram);
				
			}
			else if(p instanceof Television)
				Television t= (Television)p;
			System.out.println("type"+t.type);
			System.out.println("size"+t.size);
		}
		
	}

}
