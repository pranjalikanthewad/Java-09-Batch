package com.tech;

public class Employee {

private int eId;
	
	private String eName;
	
	private int eSalary;

	public Employee(int eId, String eName, int eSalary) {
		this.eId=eId;
		this.eName=eName;
		this.eSalary=eSalary;
		
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int geteSalary() {
		return eSalary;
	}

	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}
	
	
}
