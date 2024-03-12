package com.bms.bank;

public class Customer {
	private String bankaName = "TKA";

	private String accountNumber;
	private String accountHolderName;
	private double balance;

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public String getBankaName() {
		return bankaName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	/*
	 * public Customer(String accountNumber, String accountHolderName) {
	 * 
	 * this.accountHolderName = accountHolderName; this.accountNumber =
	 * accountNumber; this.balance = 500;
	 * 
	 * }
	 */

	/*
	 * void withdraw(double amount) { if(amount>0 ) { if(amount<=balance) {
	 * balance-=amount;
	 * System.out.println("Your A/C"+accountNumber+"Is Debited WIth "+amount);
	 * System.out.println("Your Current Balance Is "+balance);
	 * 
	 * }else { System.out.println("Insufficient BAlance"); }
	 * 
	 * } else { System.out.println("Bad Requst Can't Process"); }
	 * System.out.println("*******************************");
	 * 
	 * 
	 * }
	 * 
	 * void deposit(double amount) { if(amount>0) { balance+=amount;
	 * System.out.println("Your A/C"+accountNumber+"Is Creadited WIth "+amount);
	 * System.out.println("Your Current Balance is "+balance);
	 * 
	 * }else { System.out.println("Bad Requst Can't Process");
	 * 
	 * } System.out.println("*******************************");
	 * 
	 * }
	 */
	public void displayAccountInformation() {
		System.out.println("A/C Holder Name: " + accountHolderName);
		System.out.println("A/c Number: " + accountNumber);
		System.out.println("A/c Current Balance: " + balance);
		System.out.println("*******************************");

	}

}
