package com.jspider.ConstructorChaining;
class Student{
	Student(String name,int yop,double cgpa)
	{
		System.out.println("fresher");
		
	}
	Student(String name,int yop,double cgpa,double exp,double ctc){
		this(name,yop,cgpa);
		System.out.println("Experience");
		
	}
	
}

public class Student_info {

	public static void main(String[] args) {
		Student s1= new Student("Ram Prasad",2025,8.5,3.2,9.999);
		// TODO Auto-generated method stub

	}

}
