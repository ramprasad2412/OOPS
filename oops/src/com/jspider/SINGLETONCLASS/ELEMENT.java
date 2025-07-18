package com.jspider.SINGLETONCLASS;

public class ELEMENT {
	//public static void main(String[] args) 
		private static ELEMENT obj=null;
		public static ELEMENT getElement() {
			if(obj==null) {
				obj= new ELEMENT();
			}
			return obj;
			}
		private ELEMENT()
		{
			System.out.println("Constructor executing");
		
		
	}

}
// THIS IS A SINGLETONCLASS EXAMPLE --LAZY INITIALIZATION
