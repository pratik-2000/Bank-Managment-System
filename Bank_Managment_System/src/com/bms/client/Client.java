package com.bms.client;

import com.bms.bank.AccountTransaction;
import com.bms.bank.Customer;

public class Client {

	public static void main(String[] args) {

		Customer rutvik = new Customer();
		rutvik.setAccountHolderName("Rutvik");
		rutvik.setAccountNumber("1122");
		rutvik.setBalance(500);

		Customer nitin = new Customer();

		nitin.setAccountHolderName("nitin");
		nitin.setAccountNumber("1123");
		nitin.setBalance(500);

		/*
		 * rutvik.displayAccountInformation(); AccountTransaction.deposit(rutvik, 500);
		 */
		AccountTransaction.withdraw(rutvik, 100);
		AccountTransaction.withdraw(nitin, 200);

		/*
		 * rutvik.deposit(500);
		 * 
		 * rutvik.withdraw(100);
		 */

	}

}
