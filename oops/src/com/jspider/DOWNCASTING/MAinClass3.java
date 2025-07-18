package com.jspider.DOWNCASTING;
class Delta{
	int val= 100;
	
}
class Example extends Delta{
	int num=200;
	
}

public class MAinClass3 {
	public static void main(String[] args) {
		Delta ref= new Example();// UPCASTING
		System.out.println(ref.val);
		Example ex= (Example)ref;// DOWNCASTING
		System.out.println(ex.num);
		System.out.println(ex.val);
		
	}

}
