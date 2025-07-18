package com.jspider.ABSTARCTIONHOTSTARPROJECT;
abstract class  Hotstar{
	void login()
	{
		
	}
	abstract void watch() ;
		
	}
class Hotstarfree extends  Hotstar {
	@Override
	void watch() {
		System.out.println("Ad + trailer + free");
	}
	
}
class  HotstarVip extends  Hotstar{
	@Override
	void watch() {
		System.out.println("Ad + regional conteent");
	}
}
class HotstarPremium extends Hotstar{
	@Override
	void watch() {
		System.out.println("no Ad "+ "full access");
		
	}
}

