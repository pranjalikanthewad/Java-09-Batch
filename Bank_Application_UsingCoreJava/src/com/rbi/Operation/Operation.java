package com.rbi.Operation;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.rbi.Model.Account;

public class Operation {

	Scanner sc=new Scanner(System.in);
	Account acObj=new Account();

	public void createAccount()
	{
		while(true) {
		System.out.print("Enter Customer Name : ");
		acObj.setCustName(sc.next());
		
		System.out.print("Enter Customer Id : ");
		acObj.setCustId(sc.next());
		
		System.out.print("Enter Account Password : ");
		acObj.setAccountPassword(sc.next());
		
		
			while(true)
			{	
				Scanner sc1=new Scanner(System.in);
				System.out.print("Enter Account Number : ");
				try
				{
					acObj.setAccountNumber(sc1.nextInt());
					break;
				}catch(InputMismatchException e)
				{
					System.out.println("Please enter digits only");
				}
			
			}
		
			
		
		System.out.print("Enter Customer Address : ");
		acObj.setCustAddress(sc.next());
		
		while (true) 
		{
			double depositMoney;
			while(true)
			{
				Scanner sc2=new Scanner(System.in);
				System.out.print("Enter Deposit Money : ");
				try {
					depositMoney = sc2.nextDouble();
					break;
				}catch(InputMismatchException e)
				{
					System.out.println("Please Enter digit only");
				}
			}

			if (depositMoney > 500) 
			{
				acObj.setMoney(depositMoney);
				break;
			} else {
				System.out.println("Amount should be greater than or equal to Rs.500");
			}
		}
		System.out.println("Account created successfully...");
		break;
		}
	}
	
	public void showAccountDetails()
	{
		while (true)
		{
			int accNumber=0;
			while(true)
			{	
				Scanner sc1=new Scanner(System.in);
				System.out.print("Enter Account Number : ");
				try
				{
					accNumber = sc1.nextInt();
					break;
				}catch(InputMismatchException e)
				{
					System.out.println("Please enter digits only");
				}
			}
			
			if (acObj.getAccountNumber() == accNumber) 
			{
				System.out.println("Customer Name :" + acObj.getCustName());
				System.out.println("Customer Id :" + acObj.getCustId());
				System.out.println("Account Password :" + acObj.getAccountPassword());
				System.out.println("Account Number :" + acObj.getAccountNumber());
				System.out.println("Customer Address :" + acObj.getCustAddress());
				System.out.println("Deposit Money :" + acObj.getMoney());
			} 
			else 
			{
				System.out.println("Enter Valid Account Number..");
			}
			break;
		}
	}
	
	public void depositMoney()
	{
		int accNumber =0;
		Scanner sc1 = new Scanner(System.in);
		if(acObj.getAccountNumber()==0)
		{
			System.out.println("Please Create New Account");
		}
		else
		{
			while(true)
			{
				
				System.out.println("Enter Account Number : ");
				try 
				{

					accNumber = sc1.nextInt();
					break;
				} catch (InputMismatchException e) 
				{
					System.out.println("Please Enter digit only..");
				}
			}
							
			while (true) 
			{
				if (accNumber == acObj.getAccountNumber()) 
				{
					System.out.println("Enter Amount to be Deposit");
					double depositAmt = sc.nextDouble();
					if (depositAmt > 0) 
					{
						double totalBalance = acObj.getMoney() + depositAmt;
						acObj.setMoney(totalBalance);
						System.out.println("Account Balance is : " + totalBalance);
						break;
					} 
					else 
					{
						System.out.println("Deposit Amount should be greater than zero");
					}
				}
				else 
				{
					System.out.println("Please Enter Valid Account Number");
					break;
				}
				
			}
			
		}
	}
	
	
	public void withdrawMoney()
	{
		System.out.println("Enter Account Number : ");
		int accNumber = sc.nextInt();
		if (accNumber == acObj.getAccountNumber()) 
		{
			if (acObj.getAccountNumber() == 0) 
			{
				System.out.println("Please Create New Account");
			} 
			
			else {
				System.out.println("\nEnter amount to Withdraw  : ");
				double withdrawMoney = sc.nextDouble();

				double availmoney = acObj.getMoney();
				if (withdrawMoney > availmoney) {
					System.out.println("Insufficient funds..");
				} else {
					availmoney = availmoney - withdrawMoney;
					acObj.setMoney(availmoney);
					System.out.println("\nYour Current Balance is : " + acObj.getMoney());
				}
			}
		}
		
	}            
	public void balanceEnquiry()
	{
		while(true)
		{
			System.out.println("Enter Account Number : ");
			int accNumber=sc.nextInt();
			if(accNumber==acObj.getAccountNumber())
			{ 
					if(acObj.getAccountNumber()==0)
					{
						System.out.println("Please Create New Account");
					}
					else
					{
						System.out.println("Account Current Balance is : " +acObj.getMoney());
						
					}
			}
			else
			{

					System.out.println("Enter Valid Account Number..");
			}
			break;
		}
	}
	
	
}
