package com.jspider.ConstructorChaining;
class Alpha
{
	Alpha(){
		System.out.println("Alpha constructot");
	}
	Alpha(int a ){
		System.out.println("Alpha constructor");
	}
}
   class Beta extends Alpha 
	{
		Beta()
		{
			super();
			System.out.println("Beta constructor");
			}
		}
		
	public class Alpha_class {
	public static void main(String[] args) {
	Beta b1= new Beta();
		
	}
}




