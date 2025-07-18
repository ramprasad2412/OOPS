package com.jspider.Innerclass;
class Delta{
	void play() {
		class Example{
			void send() {
				System.out.println("Executing the send()>>>>>");
			}
		}
		Example ex= new Example();
		ex.send();
	}
}

public class Mainclass {
	public static void main(String[] args) {
		Delta obj= new Delta();
		obj.play();
		
	}

}
