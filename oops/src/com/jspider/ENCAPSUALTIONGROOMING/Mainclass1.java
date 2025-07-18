package com.jspider.ENCAPSUALTIONGROOMING;

public class Mainclass1 {
	// Main.java
	public class Main {
	    public static void main(String[] args) {
	    	Bankaccount account = new Bankaccount();

	        // Try setting a positive balance
	        account.setBalance(5000);
	        System.out.println("Current Balance: ₹" + account.getBalance());

	        // Try setting a negative balance
	        account.setBalance(-1000);
	        System.out.println("Current Balance after invalid set: ₹" + account.getBalance());
	    }
	}


}
