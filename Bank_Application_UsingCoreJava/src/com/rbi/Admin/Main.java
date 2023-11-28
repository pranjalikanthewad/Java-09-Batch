package com.rbi.Admin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.rbi.Model.Account;
import com.rbi.Operation.Operation;

public class Main {

//	public static void main(String args[])
//	{		
//		Scanner sc = new Scanner(System.in);
//		Operation opObj = new Operation();
//		
//		Account ac1=new Account();
//		ac1.setCustName("Pratiksha");
//		ac1.setCustId("123");
//		ac1.setAccountPassword("456");
//		ac1.setAccountNumber(12345);
//		ac1.setCustAddress("Nanded");
//		ac1.setMoney(2000.00);
//		
//		Account ac2=new Account();
//		ac2.setCustName("Kiran");
//		ac2.setCustId("9878");
//		ac2.setAccountPassword("345");
//		ac2.setAccountNumber(98765);
//		ac2.setCustAddress("Pune");
//		ac2.setMoney(5000.00);
//		
//		Account ac3=new Account();
//		ac3.setCustName("Amit");
//		ac3.setCustId("333");
//		ac3.setAccountPassword("806");
//		ac3.setAccountNumber(44444);
//		ac3.setCustAddress("Mumbai");
//		ac3.setMoney(9000.00);
//		
//		ArrayList al=new ArrayList();
//		al.add(ac1);
//		al.add(ac2);
//		al.add(ac3);
//		
//		
//
//		while (true)
//		{
//			System.out.println("\n*******************************************");
//			System.out.println("Welcome to the ABC Bank of Java");
//			System.out.println("\n1.Show Account Details \n2.Deposit Money \n3.Withdraw \n4.Balance Enquiry \n5.Exit");
//			System.out.print("\nSelect Your option: ");
//			int option = sc.nextInt();
//
//			switch (option) {
//			case 1:
//				System.out.println("Account Details");
//				Iterator itr=al.iterator();
//				while(itr.hasNext())
//				{
//					Object obj=itr.next();
//					System.out.println("\n"+obj);
//					
//				}
//				//opObj.showAccountDetails();
//
//				break;
//			case 2:
//				
//				break;
//			case 3:
//				opObj.depositMoney();
//				break;
//			case 4:
//				opObj.withdrawMoney();
//				break;
//			case 5:
//				opObj.balanceEnquiry();
//				break;
//				
//
//			}
//		}
//	}
}
