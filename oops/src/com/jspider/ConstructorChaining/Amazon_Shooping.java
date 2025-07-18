package com.jspider.ConstructorChaining;
class Amazon{
	Amazon(){
		System.out.println("Onlie shooping");
		
	}
	Amazon(double d)
	{
		this();
		System.out.println("Prime Subscription");
	}
}

public class Amazon_Shooping {

	public static void main(String[] args) {
		Amazon a1= new Amazon(3.5);
		// TODO Auto-generated method stub

	}

}
