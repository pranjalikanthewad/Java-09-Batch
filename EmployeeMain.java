package com.assign;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.PseudoColumnUsage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain {

	EmployeeData e1 = new EmployeeData();

	static String url = "jdbc:mysql://localhost:3306/java09";
	static String uname = "root";
	static String pass = "root";

	Scanner sc = new Scanner(System.in);

	public void insertData() {
//		EmployeeData e1=new EmployeeData();
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement ps = null;
		String sql;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(url, uname, pass);

			System.out.println("Enter Id : ");
			e1.setEid(sc.nextInt());

			System.out.println("Enter Employee Name : ");
			e1.setEname(sc.next());

			System.out.println("Enter Employee Address : ");
			e1.setEaddress(sc.next());

			System.out.println("Enter Employee Salary : ");
			e1.setEsalary(sc.nextInt());

			// sql = "insert into employee values(" + e1.getEid() + ",'" + e1.getEname() +
			// "','" + e1.getEaddress() + "'," + e1.getEsalary() + ")";

			sql = "insert into employee values(?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, e1.getEid());
			ps.setString(2, e1.getEname());
			ps.setString(3, e1.getEaddress());
			ps.setDouble(4, e1.getEsalary());

			ps.execute();

		} catch (SQLException s) {
			s.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Data successfully Inserted....");
	}

	public void getData() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet result = null;
		String sql;
		try {

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(url, uname, pass);

			sql = "select * from employee";
			ps = con.prepareStatement(sql);
			result = ps.executeQuery();// get data from employee into resultset

			while (result.next()) {
				System.out.println(result.getInt(1));
				System.out.println(result.getString(2));
				System.out.println(result.getString(3));
				System.out.println(result.getInt(4));
				System.out.println();
			}

		} catch (SQLException s) {
			s.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Data get successfully...");

	}

	public void deleteData(int eid) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet result = null;
		String sql;
		try {

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(url, uname, pass);

			sql = "delete from employee where eid=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, eid);
			ps.executeUpdate();

//			while(result.next())
//			{
//				System.out.println(result.getInt(1));
//				System.out.println(result.getString(2));
//				System.out.println(result.getString(3));
//				System.out.println(result.getInt(4));
//				System.out.println();
//			}

		} catch (SQLException s) {
			s.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Data deleted successfully");

	}

	public void updateData(String ename, String eaddress, int eid) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet result = null;
		String sql;
		try {

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(url, uname, pass);

			sql = "update employee set ename=?,eaddress=? where eid=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, ename);
			ps.setString(2, eaddress);
			ps.setInt(3, eid);
			ps.executeUpdate();

		} catch (SQLException s) {
			s.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Update successfully Done...");

	}

	public static void main(String[] args) {

		EmployeeMain obj2 = new EmployeeMain();
		Scanner sc = new Scanner(System.in);
		int eid;

		while (true) 
		{

			System.out.println("1.Insert Data\n2.Update Data\n3.Delete Data\n4.Get Data\n5.Exit\n");
			System.out.println("Enter Your Choice : ");
			int i = sc.nextInt();

			switch (i) 
			{
			case 1:
				obj2.insertData();
				break;

			case 2:
				System.out.println("Enter Employee Name : ");
				String ename = sc.next();
				System.out.println("Enter Employee Address : ");
				String eaddress = sc.next();

				System.out.println("Enter Employee Id to be Updateded");
				eid = sc.nextInt();

				obj2.updateData(ename, eaddress, eid);
				break;

			case 3:

				System.out.println("Enter id to be deleted");
				eid = sc.nextInt();
				obj2.deleteData(eid);
				break;

			case 4:
				obj2.getData();
				break;
			
			case 5:
				System.exit(0);
				break;

			}

		}

	}
}
