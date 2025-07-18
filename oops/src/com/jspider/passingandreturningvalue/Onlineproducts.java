package com.jspider.passingandreturningvalue;

//package com.jspider.passingandreturningvalue;

import java.util.Scanner;

class Products {
    int pid;
    double price;

    // Constructor
    Products(int pid, double price) {
        this.pid = pid;
        this.price = price;
    }
}

class Flipkart {
    static void displayProduct(Products p) {
        if (p != null) {
            System.out.println("Product ID: " + p.pid);
            System.out.println("Price: " + p.price);
        }
    }

    static Products createProduct() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the product ID:");
        int pid = sc.nextInt();
        
        System.out.println("Enter the price:");
        double price = sc.nextDouble();  // Fixed type mismatch
        
        Products p = new Products(pid, price);
        sc.close();  // Closing scanner
        return p;
    }
}

public class  Onlineproducts {
    public static void main(String args[]) {
        Products p1 = Flipkart.createProduct();
        Flipkart.displayProduct(p1);
    }
}







