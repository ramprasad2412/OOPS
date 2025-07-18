package com.jspider.INTERFACE;
interface language{
	void speak();
	
}
class Kannada implements language{
	@Override
	public void speak() {
		System.out.println("Kannada");
	}
}
class Hindi implements language{
	@Override
	public void speak() {
		System.out.println("Hindi");
	}
}
class English implements language{
	@Override
	public void speak() {
		System.out.println("English");
	}
}
class Google {
	static void translate(language from ,language to) {
		if(from!=null && to !=null) {
			from.speak();
			System.out.println("to ");
			to.speak();
		}
	}
	
}
public class Language_converter {
	public static void main(String[] args) {
		Kannada k= new Kannada();
		Hindi h= new Hindi();
		English l= new English();
		
		Google.translate(k, h);
		System.out.println("--------------------");
		Google.translate(k, l);
		System.out.println("--------------------");
		Google.translate(l, h);
	}

}
