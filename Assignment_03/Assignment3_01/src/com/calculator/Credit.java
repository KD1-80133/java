package com.calculator;

import java.util.*;

public class Credit {
	int account_number;
	int initial_balance;
	int items;
	int credits;
	int credit_limit;
	
	public Credit(int account_number, int initial_balance, int items, int credits, int credit_limit)
	{
		this.account_number=account_number;
		this.initial_balance=initial_balance;
		this.items=items;
		this.credits=credits;
		this.credit_limit=credit_limit;	
	}
	
	public int getAccount_number() {
		return account_number;
	}

	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}

	public int getInitial_balance() {
		return initial_balance;
	}

	public void setInitial_balance(int initial_balance) {
		this.initial_balance = initial_balance;
	}

	public int getItems() {
		return items;
	}

	public void setItems(int items) {
		this.items = items;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public int getCredit_limit() {
		return credit_limit;
	}

	public void setCredit_limit(int credit_limit) {
		this.credit_limit = credit_limit;
	}
	
	public void accept()
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter account number=");
		this.account_number=Sc.nextInt();
		System.out.println("Enter the initial balance");
		this.initial_balance=Sc.nextInt();
		System.out.println("Enter the items charged by customer this month=");
		this.items=Sc.nextInt();
		System.out.println("Enter the credits applied to the customers acoount this month=");
		this.credits=Sc.nextInt();
		System.out.println("Enter the limit of credit limit");
		this.credit_limit=Sc.nextInt();
	}
	public void display()
	{
		System.out.println("Account Number = "+account_number);
		System.out.println("Initial Balance = "+initial_balance);
		System.out.println("Items = "+items);
		System.out.println("Credits = "+credits);
		System.out.println("Credits limits = "+credit_limit);
	}
	public void calculateNewBalance()
	{
		int newBalance=this.initial_balance+this.items-this.credits;
		System.out.println("New Balance="+newBalance);
		if(newBalance>this.credit_limit)
			System.out.println("credits limit excceds=");
		else 
			System.out.println("credits limit not exceeds=");			
	}
	
}
