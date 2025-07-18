package com.jspider.passingandreturningvalue;

import java.util.Scanner;

class Account{
	long accnumber;
	double accbalance;
	Account(long accnumber, double accbalance){
		this.accbalance=accbalance;
		this.accnumber= accnumber;
		
	}
}
class Bank{
	static void displayAccountDEtails(Account a) {
		if(a!=null) {
			System.out.println("Account number"+ a.accnumber);
			System.out.println("AccountBalance:"+ a.accbalance);
		}
		
	}
	static Account createAccount() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the account number");
		long accNumber= sc.nextLong();
		System.out.println("Enter the bank balance");
		double accBalance= sc.nextDouble();
		Account a= new Account(accNumber,accBalance);
		return a;
		
	}
}

public class mainclass3 {
	public static void main(String arga[]) {
		Account a1= Bank.createAccount();
		Bank.displayAccountDEtails(a1);
		Account a2=Bank.createAccount();
		Bank.displayAccountDEtails(a2);
		// TODO Auto-generated constructor stub
	}

}
