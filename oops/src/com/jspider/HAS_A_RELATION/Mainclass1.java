package com.jspider.HAS_A_RELATION;

class Alpha{// class 
	void disp() {// method 
		System.out.println("Executoing the test()");
	}
}
class Beta{//  new class 
	Alpha a;
	Beta(Alpha a){
		this.a=a;
	}
	
}

public class Mainclass1 {
	public static void main(String[] args) {
		Alpha obj = new Alpha();// object 
		Beta b= new Beta(obj);
		b.a.disp();
		
	}

}
