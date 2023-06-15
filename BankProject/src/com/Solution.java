package com;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		System.out.println("--Welcome to AXIS Bank--");
		System.out.println("---------------------");
		Scanner scan = new Scanner(System.in);
		Bank b1 = new BankImpl(50000);

		while(true) {
			System.out.println("1: Depositing  \n2: withdrawing");
			System.out.println("3:check balance \n4: exit");
			System.out.println("enter above:");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("enter amount to be deposit");
				int amountToDeposit = scan.nextInt();
				b1.deposit(amountToDeposit); // b1.Deposit(scan.nextInt());
				break;
			case 2:
				System.out.println("enter amount to withdraw");
				int amountToWithdraw = scan.nextInt();

				b1.withdraw(amountToWithdraw); // amount.withdraw(scan.nextInt());
				break;
			case 3:
				System.out.println("Avaliable balance : Rs."+b1.checkbalance());
				break;
			case 4:
				System.out.println("thankyou!");
				System.exit(0);
				break;
			default :
				try {
					throw new InvalidChoiceException("INVALID CHOICE");
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}

			}
			System.out.println("**************************************");                          
		}
	}

}
