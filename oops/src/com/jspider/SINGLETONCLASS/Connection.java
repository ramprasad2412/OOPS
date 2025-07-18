package com.jspider.SINGLETONCLASS;

public class Connection {
	private static Connection con= new Connection() ;
	public static Connection getConnection() {
		if(con==null) {
			con= new Connection();
			
			
		}
		return con;
		
		
		
	}
	private Connection() {
		
	}

}
// this is also a singleton class but it is Enthusiastic 