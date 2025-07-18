package com.jspider.ABSTARCTION;
abstract class Utility{
	abstract void speak();
	abstract void speak(int a);
}
class Service extends Utility

{
	@Override

    void speak() {
	System.out.println("Execyting hr speak..");
	}

    @Override
    void speak(int a) {
	System.out.println("Ececuting the speak..");
    }
}
public class Mainclass5 {
	public static void main(String[] args) {
		Service sn= new Service();
		sn.speak();
		sn.speak(10);
	}
}

