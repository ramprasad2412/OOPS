package com.jspider.passingandreturningvalue;

import java.util.Scanner;

class Color{
	int red;
	int green ;
	int yellow;
	Color(int red,int green ,int yellow){
	
		this.red= red;
		this.green=green;
		this.yellow=yellow;
	}
}
class ColorPalete{
	static void showColorInfo(Color c) {
		if(c!=null) {
			System.out.println("Red "+c.red);
			System.out.println("green"+c.green);
			System.out.println("yellow"+ c.yellow);
			
			
		}
		
		
	}
	static Color selectColor() {
		Scanner sc= new Scanner(System.in) ;
		System.out.println("Enter the red");
			int red=sc.nextInt();
			//System.out.println("Enter the red");
			System.out.println("Enter the green");
			int green= sc.nextInt();
			//System.out.println("Enter the green");
			//System.out.println("Enter the green");
			System.out.println("Enter the yellow");
			int yellow= sc.nextInt();
			//System.out.println("Enter the green");
			Color c= new Color(red,green,yellow);
			return c;
			
			
				// TODO Auto-generated method stub

			}
		}

	
	

	
	


public class Mainclass4 {
	public static void main(String args[]) {
		Color c1= ColorPalete.selectColor();
		ColorPalete.showColorInfo(c1);
		Color c2= ColorPalete.selectColor();
		ColorPalete.showColorInfo(c2);
		
	}

}
