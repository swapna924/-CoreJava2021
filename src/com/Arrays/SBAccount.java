package com.Arrays;

public class SBAccount extends Account {
	double newBalance;
public SBAccount(long accountNumber, String name, double amount) {
	}

public SBAccount() {
}

final double balance=10000;

	@Override
	public	void deposit() {
		newBalance=balance+getAmount();
		System.out.println("Amount for each month is: "+ newBalance);

	}

	@Override
	public	void withdraw() {
		if(balance!=0) {
			newBalance=balance-getAmount();
			System.out.println("Balance amount after withdraw: "+newBalance);
			
		}else 
			System.out.println("withdrawl amount is greater than balance");
		
		}
		

	}


