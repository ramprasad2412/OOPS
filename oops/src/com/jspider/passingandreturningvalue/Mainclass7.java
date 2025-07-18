package com.jspider.passingandreturningvalue;

import java.util.Scanner;

class Shape{
	int sides;
	boolean solid;
	Shape(int sides,boolean solid){
		this.sides= sides;
		this.solid= solid;
		
	}
	
}
   class ShapeToolKit{
   static void drawShape(Shape s ) {
	if(s!=null) {
		System.out.println("shape of box:"+s.sides);
		System.out.println("Box is Solid"+s.solid);
	}
   }
  
	
   
   static Shape createShape() {
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter the sides");
	   int sides= sc.nextInt();
	   System.out.println("Enter the bos is solid");
	   boolean solid= sc.hasNext();
	   
	   Shape s= new Shape(sides,solid);
	   return s;
   
   }
   }
   
 public class Mainclass7 {
	 public static void main(String args[]) {
		 Shape s1= ShapeToolKit.createShape();
		 ShapeToolKit.drawShape(s1);
		 Shape s2= ShapeToolKit.createShape();
		 ShapeToolKit.drawShape(s2);
	 }
 }
		 
		 
		 
		 
		 
		 
	
   
