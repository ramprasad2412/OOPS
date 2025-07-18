package com.jspider.intro;
class Students{
	int rollno;
	String name;
	int yop;
	double cgpa;
	void Writing() {
		System.out.println("The roll number :"+rollno);
		System.out.println("The name of students  :"+name);
		System.out.println("The yop of students :"+yop);
		System.out.println("The cgpa of students :"+cgpa);
	}
	void Listening() {
		System.out.println("The roll number :"+ rollno);
		System.out.println("The name of students  :"+name);
		System.out.println("The yop of students :"+yop);		
		System.out.println("The cgpa of students :"+cgpa);
	
			
		}
	
	
		
	}
public class Student {
	

	public static void main(String args[]) {
		Students s1= new Students();
		s1.rollno=101;
		s1.name="Rama";
		s1.cgpa=8.5;
		s1.yop=2024;
		s1.Writing();
		s1.Listening();
		//System.out.println(s1);
		Students s2= new Students();
		s2.cgpa=8.5;
		s2.name="Ram Prasad";
		s2.rollno=102;
		s2.yop=2025;
		s2.Listening();
		s2.Writing();
	}
		
		
}
	
