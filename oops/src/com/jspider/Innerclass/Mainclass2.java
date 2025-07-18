package com.jspider.Innerclass;
class Alpha{
	class Beta{
		void disp() {
			System.out.println("executing the disp()...");
		}
	}
}

public class Mainclass2 {
	public static void main(String[] args) {
		Alpha.Beta ref;
		ref= new Alpha().new Beta();
		ref.disp();
	}

}
