package com.Arrays;

public class CurrentAccount extends Account {
	double newBalance;
	
	CurrentAccount(long accNumber, String name, double amount) {
		setAccountNumber(accNumber);
		this.setName(name);
		this.setAmount(amount);
	}

	public CurrentAccount() {
	}

	final double balance = 20000;

	@Override
	public	void deposit() {
		double newBalance = balance + getAmount();
		System.out.println("amount deposited is: " + newBalance);
	}

	@Override
	public	void withdraw() {
		newBalance = balance -getAmount();
		System.out.println("amount deposited is: " +newBalance );

	}

}
