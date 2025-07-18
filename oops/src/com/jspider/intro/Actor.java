package com.jspider.intro;
class act{
	void acting() {
		System.out.println("Actor is  acting");
	}
}

public class Actor {
	public static void main(String[] args) {
		act a1= new act();
		act a2= null;
		System.out.println(a1);
		System.out.println(a2);
		a1.acting();
		a2.acting();//java.lang.NullPointerException// because "a2" is null
	}

}
