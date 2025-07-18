package com.jspider.METHODOVERIDING;
class Facebookold{
	void reaction() {
		System.out.println("Like ");
	}
}
class FacebookNew  extends Facebookold {
@Override

	void reaction()
	{
		System.out.println("like ,love ,wow ,haha ");
	}
}

public class Mainclass6 {
	public static void main(String[] args) {
		Facebookold ref= new FacebookNew();// type casting 
		ref.reaction();
	}

}
