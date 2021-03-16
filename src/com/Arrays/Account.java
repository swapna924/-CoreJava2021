package com.Arrays;

public abstract class Account {

	private long accountNumber;
	private String name;
	private double amount;

	public abstract void deposit();

	public abstract void withdraw();

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", amount=" + amount + "]";
	}
	
}
