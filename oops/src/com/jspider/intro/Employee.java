package com.jspider.intro;
class program2{
	int empid;
	String ename;
	double ctc;
	void work() {
		System.out.println("The empid is;"+ empid);
		System.out.println("The ename is :"+ename);
		System.out.println("The emp ctc is :"+ctc);
		//System.out.println();
	}
}

public class Employee {
	public static void main(String args[]) {
		program2 p1= new program2();
		p1.empid= 101;
		p1.ctc=4.6;
		p1.ename="Ram Prasad";
		p1.work();
	}

}
