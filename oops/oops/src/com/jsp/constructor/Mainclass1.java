package com.jsp.constructor;

 class Biryani {
	Biryani(int a){
		System.out.println("Mitton biryani");
	}
	Biryani(int a, int b){
		System.out.println("Chicken biryani");
		
	}
	Biryani(int a,int b,int c){
		System.out.println("veg pullao");
	}
 }
	class Mainclass1 {
	public static void main(String[] args) {
		Biryani b1= new Biryani(10);
		Biryani b2= new Biryani(10,20);
		Biryani b3= new Biryani(10,20,30);
		
		
		
	}

}
