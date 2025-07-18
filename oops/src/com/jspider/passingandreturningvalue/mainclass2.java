package com.jspider.passingandreturningvalue;
import java.util.Scanner;

class Product{
	int pid;
	int price;
	Product(int pid,double price_){
		this.pid=pid;
		this.price= price;
	}
}
class Flipcart{
	static void displayProduct(Product p) {
		if(p!=null) {
			System.out.println("pid"+ p.pid);
			System.out.println("price"+ p.price);
			
			
		}
	}
	static Product createProduct() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the pid:");
		int pid =sc.nextInt();
		System.out.println("Enter the price:");
	    double  price= sc.nextInt();
	    Product p= new Product(pid,price);
	    return p;
	    
		
		
		
		
	}
}


public class mainclass2 {
	public static void main(String args[]) {
	//public class product {
		//public static void main(String //args[]) {
			Product p1= Flipcart.createProduct();
			//System.out.println(p1);
			
			Flipcart.displayProduct(p1);
			Product p2= Flipcart.createProduct();
			//System.out.println(p1);
			
			Flipcart.displayProduct(p2);
			
			
		}
	}

			


