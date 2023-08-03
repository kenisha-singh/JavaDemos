package com.lumen.inherdemos;

public class AccountSaving extends  AtmMachine {


	public AccountSaving(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public
	void withDraw(double amount) {
		System.out.println("Savings withdraw: "+(balance-amount-100));
		balance=balance-amount-100;
	}

	@Override
	public
	void deposit(double amount) {
		System.out.println("Savings deposit: "+(balance+amount+100));
		balance=balance+amount+100;
	}

}


	