package com.jspider.INTERFACE;
interface Driver{
	void register();
	
}
// IMPLEMENTATION BY 
//Oracle
class OracleDriver implements Driver{
	@Override
	public void register() {
		System.out.println("Registered to Oracle  10g");
	}
}
// My Sql
class MysqlDriver implements Driver{
	@Override
	public void register() {
		System.out.println("Registered to MYsql");
	}
}
//ibm
class DB2Driver implements Driver{
	@Override
	public void register() {
		System.out.println("Registered to DB2");
	}
}
// SERVICE MANAGER
//sun microsystem
class DriverManager{
	 static void RegisterDriver (Driver d) {
		if(d!=null) {
			d.register();
			
		}
	}
}
// MAINCLASS
// it is only implements by software Engineer

public class Driver_project {
	public static void main(String[] args) {
		OracleDriver od= new OracleDriver();
		DriverManager.RegisterDriver(od);
		
		MysqlDriver md= new MysqlDriver();
		DriverManager.RegisterDriver(md);
		
		DB2Driver dd= new DB2Driver();
		DriverManager.RegisterDriver(dd);
		
		
	}

}
