package com.jspider.DOWNCASTING;
class Alpha{
	void help() {
		System.out.println("Excecuting the help()");
		
	
	

	} 
}
class Beta extends Alpha{
	void run() {
		System.out.println("Executing run()");
	}
}


public class Mainclass2 {
	public static void main(String[] args) {
		Alpha ref= new Beta();//UPCATING HO RHA HAI
		ref.help();
		Beta obj= (Beta)ref;//DOWNCATIONG
	}

}
