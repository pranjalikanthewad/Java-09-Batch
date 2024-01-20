package com.tech;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
	static SessionFactory sf=HibernateUtil.getSeesionFactory();
	static Session session;
	Transaction t;
	static Scanner sc=new Scanner(System.in);
	
	Account a=new Account();
	
	
	

}
