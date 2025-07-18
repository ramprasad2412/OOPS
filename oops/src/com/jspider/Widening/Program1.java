package com.jspider.Widening;
// widening is supported by the compiler
public class Program1 {
	public static void main(String[] args) {
		int a=1;
		double b= a;//WIDEMING---:int---double;
		System.out.println(b);
		
		char c= 'a';
		int d= c;//WIDENING --:Char ---->int 
		System.out.println(d);
		
		float f= 2.4f;
		double k=f;// WIDENING------:float ---->double 
		System.out.println(k);
		
		
	}

}
