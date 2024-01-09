package com.assign;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain {
	
//	EmployeeData e=new EmployeeData();
	
	static String url="jdbc:mysql://localhost:3306/java09";
	static String uname="root";
	static String pass="root";
	
	Scanner sc=new Scanner(System.in);	
	
	public void insertData() 
	{
		EmployeeData e1=new EmployeeData();
		Scanner sc=new Scanner(System.in);
		Connection con = null;
		Statement smt = null;
		String sql;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");

			 con = DriverManager.getConnection(url, uname, pass);
			
			System.out.println("Enter Id : ");
			e1.seteId(sc.nextInt());
			
			System.out.println("Enter Employee Name : ");
			e1.seteName(sc.next());
			
			System.out.println("Enter Employee Address : ");
			e1.seteAddress(sc.next());
			
			System.out.println("Enter Employee Salary : ");
			e1.seteSalary(sc.nextInt());

			 sql = "insert into employee values(" + e1.geteId() + "," + e1.geteName() + "," + e1.geteAddress() + "," + e1.geteSalary() + ")";
			 smt = con.createStatement();
			smt.execute(sql);
			
		} catch (SQLException s) 
		{
			s.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally 
		{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				smt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Data successfully saved");
	}
	
	public void getData()
	{
		Connection con = null;
		Statement smt = null;
		ResultSet result=null;
		String sql;
		try 
		{

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(url, uname, pass);

			sql = "select * from employee";
			smt = con.createStatement();
			result=smt.executeQuery(sql);//get data from employee into resultset
			
			while(result.next())
			{
				System.out.println(result.getInt(1));
				System.out.println(result.getString(2));
				System.out.println(result.getString(3));
				System.out.println(result.getInt(4));
				System.out.println();
			}
			
		} catch (SQLException s) 
		{
			s.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally 
		{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				smt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Data get successfully");
		
	}
	
	
	public void deleteData()
	{
		Connection con = null;
		Statement smt = null;
		ResultSet result=null;
		String sql;
		try 
		{

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(url, uname, pass);

			sql = "delete from employee where eid=5";
			smt = con.createStatement();
			smt.execute(sql);//delete data from employee 
			
			
//			while(result.next())
//			{
//				System.out.println(result.getInt(1));
//				System.out.println(result.getString(2));
//				System.out.println(result.getString(3));
//				System.out.println(result.getInt(4));
//				System.out.println();
//			}
			
		} catch (SQLException s) 
		{
			s.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally 
		{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				smt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Data deleted successfully");
		
		
	}
	
	public void updateData()
	{
		Connection con = null;
		Statement smt = null;
		ResultSet result=null;
		String sql;
		try 
		{

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(url, uname, pass);

			sql = "update employee set ename='Amit',eaddress='Nanded' where eid=1";
			smt = con.createStatement();
			smt.executeUpdate(sql);//delete data from employee 
			
		} catch (SQLException s) 
		{
			s.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally 
		{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				smt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Update successfully...");
		
	}

public static void main(String[] args){
		
		EmployeeMain obj2=new EmployeeMain();

		
		obj2.insertData();
		
		System.out.println("added1");	
		
	}
}
