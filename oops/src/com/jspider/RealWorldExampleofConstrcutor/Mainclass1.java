package com.jspider.RealWorldExampleofConstrcutor;

import java.util.Scanner;

class Product{
	int pid;
	double  price;
	
	Product(int pid,double price){
		this.pid=pid;
		this.price=price;
		
	}
}
class Flipcart{
	static void displayProduct(Product p) {
		if(p!=null) {
			System.out.println("pid"+p.pid);
			System.out.println("price"+p.price);
			
			
			
		}
	}
	static Product CreateProduct() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the pid");
		int pid= sc.nextInt();
		System.out.println("Enter the price");
		int price=sc.nextInt();
		Product p= new Product(pid,price);
		return p;
	}
	
}

public class Mainclass1 {
	public static void main(String[] args) {
		Product p1=  Flipcart.CreateProduct();
		Flipcart.displayProduct(p1);
		Product p2= Flipcart.CreateProduct();
		Flipcart.displayProduct(p2);
	}

}
