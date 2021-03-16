package com.Arrays;

public class AccountTest {

	public static void main(String[] args) {
		
		SBAccount sb=new SBAccount();
		
		CurrentAccount ca=new CurrentAccount();
		/*
		 * System.out.println("Enter the name ,account Number, amount"); Scanner sc=new
		 * Scanner(System.in); String name=sc.next(); long accNumber=sc.nextLong();
		 * double amount=sc.nextDouble();
		 */
sb.deposit();
ca.deposit();
System.out.println();
sb.withdraw();
ca.withdraw();
	}
}