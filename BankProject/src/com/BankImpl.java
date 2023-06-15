package com;

public class BankImpl implements Bank {
	int balance;
	BankImpl(int balance){
		this.balance = balance;
	}

	@Override
	public void deposit(int amount) {
		System.out.println("Deposition RS"+amount);
		balance = balance + amount; // balance += amount;
		System.out.println("amount Deposited sucessfully");

	}
	@Override
	public void withdraw(int amount) {
		if(amount <= balance) {
			System.out.println("withdrawing RS"+amount);
			balance = balance - amount; // balance -= amount;
			System.out.println("amount withdrawing sucessfully");
		}
		else
		{
			try
			{
				throw new InsufficientBalanceException("insufficient balance");
			}
			catch(Exception e)
			{
			System.out.println(e.getMessage());
			}
		}
	}
	@Override
	public int checkbalance() {
		return balance;
	}

}
