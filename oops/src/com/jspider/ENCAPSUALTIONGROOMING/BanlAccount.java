
	package com.jspider.ENCAPSUALTIONGROOMING;
	import java.util.*;
	public class BanlAccount {
		static class BankAccount {
		        private double balance;

		        public double getBalance() {
		            return balance;
		        }

		        public void setBalance(double balance) {
		            if (balance >= 0) {
		                this.balance = balance;
		            } else {
		                System.out.println(" Balance cannot be negative.");
		            }
		        }
		}
		public static void main(String[] args) {
		    	
		        BankAccount account = new BankAccount();

		        account.setBalance(-500); 
		        System.out.println("Current Balance:" + account.getBalance());

		        account.setBalance(-500);
		        System.out.println("Balance after invalid set:" + account.getBalance());
		    }
		}
	



		


