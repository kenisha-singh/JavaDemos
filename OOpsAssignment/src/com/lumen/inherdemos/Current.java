package com.lumen.inherdemos;

public class Current extends AtmMachine {
 

	public Current(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public
	void withDraw(double amount) {
		System.out.println("Current withdraw: "+(balance-amount-50));
		balance=balance-amount-50;
	}

	@Override
	public
	void deposit(double amount) {
		System.out.println("Current deposit: "+(balance+amount+50));
		balance=balance+amount+50;
	}
	

}
