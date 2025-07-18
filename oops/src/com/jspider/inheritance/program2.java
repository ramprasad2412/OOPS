package com.jspider.inheritance;
class Instagramold{
	void post() {
		System.out.println("Posting photos");
	}
}

	class Instagramnew extends Instagramold{
		void message() {
			System.out.println("Sending message");
		}
	}
	
public class program2 {
	public static void main(String[] args) { 
		 Instagramnew ref= new  Instagramnew();
		 ref.post();
		 ref.message();
		 
		
	}

}
