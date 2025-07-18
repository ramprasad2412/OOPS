package com.jspider.Instanceofexample2;

public class Product {
	int pid;
	double price;
	Product(int pid ,double price)
	{
		this.pid=pid;
		this.price=price;
		
	}

}
class Mobile  extends Product{
	String brand;
	int  ram;
	Mobile(int pid,double price,String brand,int ram){
		super(pid,price);
		this.brand=brand;
		this.ram= ram;
	}
}
class Television extends Product{
	String type;
	int size;
	Television(int pid,double price,String type,int size){
		super(pid,price);
		this.type= type;
		this.size= size;
	}

}