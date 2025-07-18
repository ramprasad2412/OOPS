package com.jspider.SINGLETONCLASS;

public class Mainclass2 {
	public static void main(String[] args) {
		Connection c1=Connection.getConnection();
		Connection c2=Connection.getConnection();
		Connection c3=Connection.getConnection();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
