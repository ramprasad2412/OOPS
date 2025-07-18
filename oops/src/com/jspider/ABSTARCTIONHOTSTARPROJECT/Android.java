package com.jspider.ABSTARCTIONHOTSTARPROJECT;

public class Android {
	void service()
	{
		
	}
	abstract void ui();

	
	
}
class Samsung extends Android{
	@Override
	void ui() {
		System.out.println("Galaxy Os");
	}
}
class Vivo extends Android {
	@Override
	void ui() {
		System.out.println("Funtuch os");
		
		
	}
}
class Oppo extends Android {
	@Override
	void ui() {
		System.out.println("color os");
	}
}
