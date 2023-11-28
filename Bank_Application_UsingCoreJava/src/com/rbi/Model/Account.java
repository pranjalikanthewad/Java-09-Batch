package com.rbi.Model;

public class Account {

	private int accountNumber;
	private String accountPassword;
	private String custId;
	private String custName;
	private String custAddress;
	private Double depositmoney;
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountPassword() {
		return accountPassword;
	}
	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public Double getMoney() {
		return depositmoney;
	}
	public void setMoney(Double money) {
		this.depositmoney = money;
	}
	@Override
	public String toString() {
		return " Account Number=" + accountNumber + "\n Password=" + accountPassword + "\n Id=" + custId
				+ "\n Name=" + custName + "\n Address=" + custAddress + "\n Deposit Money=" + depositmoney + "";
	}

	
	
	
	
	
}
