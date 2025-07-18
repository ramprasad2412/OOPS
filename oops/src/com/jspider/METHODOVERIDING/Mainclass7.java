package com.jspider.METHODOVERIDING;
class Whatsapp1{
	void sentdeliveryReport() {
		System.out.println("sent");
	}
}
class Whatsapp2 extends Whatsapp1{
	@Override
	void sentdeliveryReport() {
		System.out.println("sent -Delivered");
	}
		
}
class Whatsapp3 extends Whatsapp2{
	void sentdeliveryReport() {
		System.out.println("sent -Delivered -Seen");
	}
}





public class Mainclass7 {
	public static void main(String[] args) {
		Whatsapp1 ref= new Whatsapp3();//typecasting
		ref.sentdeliveryReport();
	}

}
