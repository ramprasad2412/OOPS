package com.jspider.ENCAPSUALTIONGROOMING;
import java.util.*;


public class Bankaccount {
	
	//public class BankAccountTest {

	    // BankAccount class with encapsulation
	    static class BankAccount {
	        private double balance;

	        public double getBalance() {
	            return balance;
	        }

	        public void setBalance(double balance) {
	            if (balance >= 0) {
	                this.balance = balance;
	            } else {
	                System.out.println("❌ Balance cannot be negative.");
	            }
	        }
	    }
	

	    // Main method to test the class
	    
	    public static void main(String[] args) {
	    	Scanner sc= new Scanner(System.in);
	    	int num= sc.nextInt();
	    	System.out.println("Enter the bank blance");
	        BankAccount account = new BankAccount();

	        account.setBalance(1000); // Valid balance
	        System.out.println("Current Balance: ₹" + account.getBalance());

	        account.setBalance(-500); // Invalid balance
	        System.out.println("Balance after invalid set: ₹" + account.getBalance());
	    }
	}
}



	