package com.rbi.Admin;

import java.util.Scanner;

import com.rbi.Operation.Operation;

public class Main2 {

	public static void main(String args[])
	{		
		Scanner sc = new Scanner(System.in);
		Operation opObj = new Operation();

		while (true)
		{
			System.out.println("\n*******************************************");
			System.out.println("Welcome to the ABC Bank of Java");
			System.out.println("\n1.Create Account \n2.Show Account Details \n3.Deposit Money \n4.Withdraw \n5.Balance Enquiry \n6.Exit");
			System.out.print("\nSelect Your option: ");
			int option = sc.nextInt();

			switch (option) {
			case 1:
				opObj.createAccount();
				break;
			case 2:
				opObj.showAccountDetails();
				break;
			case 3:
				opObj.depositMoney();
				break;
			case 4:
				opObj.withdrawMoney();
				break;
			case 5:
				opObj.balanceEnquiry();
				break;
				

			}
		}
	}
}
