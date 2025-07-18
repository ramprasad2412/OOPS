package com.jspider.Narrowing;

public class Program1 {

	public static void main(String[] args) {
		double d= 6.7;
		int i=(int )d;//Narrowing ---:double ---->int 
		System.out.println(i);
		int a=65;
		char c=(char) a;//Narrowing :int ----->char
		System.out.println(c);
		
		float f=12.23f;// Narrowing :Float ---->long
		long y=(long) f;
		System.out.println(y);
		
		// TODO Auto-generated method stub

	}

}
