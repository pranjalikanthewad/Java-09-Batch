package com.tech;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data

public class Account {
	
	
	@Id
	private int accountNumber;
	
	private String userName;
	private String userPassword;
	
	
	private String custName;
	private String custAddress;
	private long mobno;
	private String adharNo;
	private String panNo;
	private String acType;
	//private double money;
	private double depositmoney;
	//private double balance;
	
	
	
	

}
