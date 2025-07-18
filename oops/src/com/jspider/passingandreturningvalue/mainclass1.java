package com.jspider.passingandreturningvalue;
class Demo{
	int a;
	int b;
	Demo(int a,int b){
		this.a=a;
		this.b=b;
	}
}
		
	
	class Helper{
		static void display(Demo d) {
			System.out.println(d.a);
			System.out.println(d.b);
			
			
		}
		static Demo create()
		{
			Demo d= new Demo(25,26);
			return d;
			
			
		}
	}
	


public class mainclass1 {
	
public static void main(String args[]) {
		
		Demo d1= Helper.create();
		Helper.display(d1);
		
		
		Demo d2= Helper.create();
		Helper.display(d2);
		
		Demo d3= Helper.create();
		Helper.display(d3);
}
}

	





