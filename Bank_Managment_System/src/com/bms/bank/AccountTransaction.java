package com.bms.bank;

public class AccountTransaction {

	public static void withdraw(Customer c, double amount) {
		c.displayAccountInformation();// call display method

		if (amount > 0) {
			if (amount <= c.getBalance()) {
				double currentBalance = c.getBalance() - amount;
				c.setBalance(currentBalance);
				// c.balance -= amount;
				// c.setBalance(c.getBalance() - amount);

				System.out.println("Your A/C" + c.getAccountNumber() + "Is Debited WIth " + amount);
				System.out.println("Your Current Balance Is " + c.getBalance());

			} else {
				System.out.println("Insufficient BAlance");
			}

		} else {
			System.out.println("Bad Requst Can't Process");
		}
		System.out.println("*******************************");

	}

	public static void deposit(Customer c, double amount) {
		if (amount > 0) {
			double currentBalance = c.getBalance() + amount;
			c.setBalance(currentBalance);
			// c.balance += amount;
			System.out.println("Your A/C" + c.getAccountNumber() + "Is Creadited WIth " + amount);
			System.out.println("Your Current Balance is " + c.getBalance());

		} else {
			System.out.println("Bad Requst Can't Process");

		}
		System.out.println("*******************************");

	}

}
