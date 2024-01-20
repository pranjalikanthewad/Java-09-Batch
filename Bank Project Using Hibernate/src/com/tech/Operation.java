package com.tech;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class Operation {
	
	static SessionFactory sf=HibernateUtil.getSeesionFactory();
	static Session session;
	Transaction t;
	static Scanner sc=new Scanner(System.in);
	Account a=new Account();
	
	
public static void main(String[] args) {
		
		Operation op=new Operation();
		while (true) 
		{
			
		System.out.print("\n1.Create Customer Account \n2.Update Customer Details "
				+ "\n3.Delete Customer Account \n4.Get Balance \n5.Withdraw \n6.Deposite Money "
				+ "\n7.Transfer Money \n8.Show A/C Details\n9.Exit\n");
		System.out.print("\nEnter Your Choice : ");
		int x=sc.nextInt();

			switch (x) 
			{

			case 1:
				op.createAccount();
				break;
				
			case 2:
				op.updateCustomerDetails();
				break;
				
			case 3:
				op.deleteCustomerAccount();
				break;
				
			case 4:
				op.getBalance();
				break;
				
			case 5:
				op.withdrawAmt();
				break;
				
			case 6:
				op.depositMoney();
				break;
				
			case 7:
				op.transferMoney();
				break;
				
			case 8 :
				while (true) {
					System.out.print("\n1.Show All Customer Details\n2.Show Customer details By Id");
					System.out.print("\nEnter Choice : ");
					int i = sc.nextInt();
					switch (i) 
					{
					case 1:
						op.showAllCustomer();
						break;

					case 2:
						op.showCustomerDetailsById();
						break;
					}
					break;
				}
				break;
			case 9:
				System.exit(0);
				break;
			}
		}
	}
	
	public void createAccount()
	{
		session=sf.openSession();		
		
		while(true)
		{
			System.out.print("\nEnter Account Number : ");
			
			
			while(true)
			{
				try {
					a.setAccountNumber(sc.nextInt());
					break;
					
				} catch (InputMismatchException e) {
					System.out.println("Please enter digits only");
				}	
			}
			
			System.out.print("\nEnter Name : ");
			a.setCustName(sc.next());
			
			System.out.print("\nEnter Address : ");
			a.setCustAddress(sc.next());
			
			System.out.print("\nEnter Mobile No. : ");
			a.setMobno(sc.nextLong());
			
			System.out.print("\nEnter Adhar Number : ");
			a.setAdharNo(sc.next());
			
			System.out.print("\nEnter Pan Number : ");
			a.setPanNo(sc.next());
			
//			while(true)
//			{
			System.out.print("\nEnter Account Type : ");
//			try {
				a.setAcType(sc.next());
				//break;
				
//			} catch (Exception e) {
//				System.out.println("Account Type Should be Saving or Current..");
//			}
				
			System.out.print("\nEnter Username : ");
			a.setUserName(sc.next());
			
			System.out.print("\nEnter Password : ");
			a.setUserPassword(sc.next());
			
			while(true)
			{
				System.out.print("\nEnter Deposite Money : ");
				double depositAmt = sc.nextDouble();
				if (depositAmt >= 500) {
					a.setDepositmoney(depositAmt);		
					break;
				} else {
					System.out.println("Deposite Amount Should Be Greater than 500 Rs.");
				}
			}
			session.save(a);
			session.beginTransaction().commit();
			break;
		}
		//t.commit();
//		session.close();
//		sf.close();
	}
	
	
	public void showCustomerDetailsById()
	{
		session=sf.openSession();
		while(true)
		{
			int acNo = 0;
			while(true)
			{
				System.out.print("Enter Account Number to be get data ");
				acNo=sc.nextInt();
				
				Account a=session.get(Account.class, acNo);
				if(a!=null)
				{
					//System.out.println(a);
					
					System.out.println("Account Number : "+a.getAccountNumber());
					System.out.println("Customer Name : "+a.getCustName());
					System.out.println("Address : "+a.getCustAddress());
					System.out.println("Mobile No : "+a.getMobno());
					System.out.println("Account Type : "+a.getAcType());
					System.out.println("Adhar Number : "+a.getAdharNo());
					System.out.println("Pan Number : "+a.getPanNo());
					System.out.println("Current Balance : "+a.getDepositmoney());
					break;
				}
				else
				{
					System.out.println("Customer Id does not Exist..");
				}
			}break;
		}
	}
	
	
	public void showAllCustomer()
	{
		session=sf.openSession();
		List<Account> list = session.createQuery("from Account").list();
		//System.out.println(list);
		for(Account a : list)
		{
			System.out.println(a.getAccountNumber());
			System.out.println(a.getCustName());
			System.out.println(a.getCustAddress());
			System.out.println(a.getMobno());
			System.out.println(a.getAcType());
			System.out.println(a.getAdharNo());
			System.out.println(a.getPanNo());
			System.out.println(a.getDepositmoney());
			System.out.println("****************************");
		}
	}
	
	
	public void updateCustomerDetails()
	{
		session=sf.openSession();
		System.out.print("Enter Account Number to be Updated");
		int acNo=sc.nextInt();
		
		System.out.print("Enter Customer Address to be Updated");
		String addrs=sc.next();
		
		System.out.print("Enter Customer Mobile Number to be Updated");
		long mobno=sc.nextLong();
		
		Account a=session.load(Account.class, acNo);
		a.setCustAddress(addrs);
		a.setMobno(mobno);
		
		
		session.beginTransaction().commit();
	}
	
	public void deleteCustomerAccount()
	{
		session=sf.openSession();
		System.out.print("Enter Account Number to be deleted ");
		int acNo=sc.nextInt();
		
		//Delete data from database from given id
		Account a = session.get(Account.class, acNo);
		session.delete(a);
		session.beginTransaction().commit();
	}
	
	public void getBalance()
	{
		session = sf.openSession();
		Account a=new Account();
		while (true) 
		{
			System.out.print("Enter Account Number : ");
			int acNo = sc.nextInt();
			
//			System.out.println("Enter Account Number : ");
//			int acNo = sc.nextInt();

			Account ac = session.get(Account.class, acNo);
			
		  acNo=a.getAccountNumber();
			if(a.getAccountNumber()==acNo)
			{
//				if (a.getAccountNumber() == ac.getAccountNumber()) 
//				{	
					System.out.println(ac.getDepositmoney());
					break;
				
//				} 
//				else 
//				{
//					System.out.println("Enter Valid Account Number..");
//				}
			} else {
				System.out.println("Enter Valid Customer Id");
			}
		}
		
//			if(acNo==a.getAccountNumber())
//			{
//				System.out.println(ac.getMoney());
//			}
//			else
//			{
//				System.out.println("Account Does not Exist");
//				
//			}		
	}
	
	public void depositMoney()
	{
		session = sf.openSession();
		while (true) 
		{
			System.out.print("Enter Account Number : ");
			int acNo = sc.nextInt();
		
			System.out.print("Enter Amount to Be Deposited");
			double amt=sc.nextDouble();
			
			Account ac=session.get(Account.class, acNo);
				
			if(amt>0)
			{
				double totalBalance = amt + ac.getDepositmoney();	
				ac.setDepositmoney(totalBalance);
				session.beginTransaction().commit();
				
				System.out.print("Account Balance is : " + totalBalance);
				break;
			}
			else
			{
				System.out.println("Please Enter Amount greater than Zero");
			}
		}
	}
	
	public void transferMoney()
	{
		session=sf.openSession();
		
		System.out.println("Enter Account Number to transfer money : ");
		int acNoTo=sc.nextInt();
		Account toAccount = session.get(Account.class, acNoTo);
		
		System.out.println("Enter Account Number From transfer money : ");
		int acNoFrom=sc.nextInt();
		Account fromAccount = session.get(Account.class, acNoFrom);
		
		System.out.println("Enter Amount to be transfer : ");
		double amt=sc.nextDouble();
		
		if(amt <= fromAccount.getDepositmoney() && amt > 0)
		{
			double credit=toAccount.getDepositmoney() + amt;
			toAccount.setDepositmoney(credit);
			
			double debit=fromAccount.getDepositmoney() - amt;
			fromAccount.setDepositmoney(debit);
			
			session.beginTransaction().commit();
			
			System.out.println("Money Transfer Successfully done..");
		}	
	}
	
	
	public void withdrawAmt()
	{	
		session=sf.openSession();	
		
		System.out.println("Enter Account Number : ");
		int acNo = sc.nextInt();
		
		System.out.println("\nEnter amount to Withdraw  : ");
		double withdrawMoney = sc.nextDouble();

		Account ac = session.get(Account.class, acNo);
		
		double availmoney = ac.getDepositmoney();
		
		if (withdrawMoney > availmoney) 
		{
			System.out.println("Insufficient funds..");
		} else 
		{
			availmoney = availmoney - withdrawMoney;
			ac.setDepositmoney(availmoney);
			System.out.println("\nYour Current Balance is : " + ac.getDepositmoney());
		}
		session.beginTransaction().commit();	
	}
	

}
