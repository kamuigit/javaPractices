package org.afasd;


import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
class Account {
	// Type your code
	protected String accountNumber;
	protected double balance;
	protected String accountHolderName;
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

}
class SavingAccount extends Account {

	// Type your code
	protected double minimumBalance;

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	
}
class FixedAccount extends SavingAccount {
	
	// Type your code
	private int lockingPeriod;
	public int getLockingPeriod() {
		return lockingPeriod;
	}
	public void setLockingPeriod(int lockingPeriod) {
		this.lockingPeriod = lockingPeriod;
	}
	
}
class AccountBO {
	// Type your code
	public void getAccountDetail(String detail) {
		System.out.format("%-20s %-10s %-20s %-20s %s\n","Account Number","Balance","Account holder name","Minimum balance","Locking period");
		String [] ar = detail.split(",");
		FixedAccount fx = new FixedAccount();
		fx.setAccountNumber(ar[0]);
		fx.setBalance(Double.parseDouble(ar[1]));
		fx.setAccountHolderName(ar[2]);
		fx.setMinimumBalance(Double.parseDouble(ar[3]));
		fx.setLockingPeriod(Integer.parseInt(ar[4]));
		System.out.format("%-20s %-10s %-20s %-20s %s\n",fx.getAccountNumber(),fx.getBalance(),fx.getAccountHolderName(),fx.getMinimumBalance(),fx.getLockingPeriod());
		
	}
}
class chum {
	public static void main(String [] args) {
		// Type your code
		Scanner sc = new Scanner(System.in);
		String detail = sc.nextLine();
		sc.close();
		AccountBO bo = new AccountBO();
		bo.getAccountDetail(detail);
		
		
		
		
		
	}
}
