package com.jspider.encapsulation;
class Student{
	private String name;
	private int cid ;
	private double cgpa;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	
	

	}
	


public class Mainclass3 {

	public static void main(String[] args) {
		Student s= new Student();
		s.setName("Ram Prasad");
		s.setCid(101);
		s.setCgpa(9.6);
		System.out.println("sttudent name:"+s.getName());
		System.out.println("cid :"+ s.getCid());
		System.out.println("cgpa:"+s.getCgpa());
		
		
		// TODO Auto-generated method stub

	}

}
