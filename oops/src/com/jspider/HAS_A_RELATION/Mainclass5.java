package com.jspider.HAS_A_RELATION;
class Department{
	void teach() {
		System.out.println("Department learning ");
		
	}
}
class Student{
	void learn() {
		System.out.println("Student Learning");
		
	}
}
class College{
	Department dept= new Department();// college has a department:Composition
	Student s;// College Has -a - Student:Aggregation
	College(Student s){
		this.s=s;
		
		
	}
}

public class Mainclass5 {
	public static void main(String[] args) {
		Student obj= new Student();
		College col= new College(obj);
		col.dept.teach();
		col.s.learn();
	}

}
