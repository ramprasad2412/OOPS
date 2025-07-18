package com.jspider.SINGLETONCLASS;

public class TableData {
	private static TableData con= new TableData() ;
	public static getTableData() {
		if(con==null) {
			con= new TableData();
			
			
		}
		return con;
		
		
		
	}
	private TableData() {
		
	}

}