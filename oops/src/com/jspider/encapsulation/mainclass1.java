package com.jspider.encapsulation;
//package com.jspider.encapsulation;
 class Account {
	 
	private long accountNumber;
	private double accountBalance;
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
}
public class mainclass1
{
	public static void main(String[] args)
	{
		Account a= new Account();
		a.setAccountNumber(12345678l);
		a.setAccountBalance(123456.0);
		System.out.println("AccountNumber:" + a.getAccountNumber());
		System.out.println("AccountBalance:" + a.getAccountBalance());
	}
}
		

