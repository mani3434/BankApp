package com.fund.BankApp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class AccountEntity {

	@Id
	@Column(name = "accountNo")
	private int accountNo;
	
	@Column(name = "accountHolderName")
	private String accountHolderName;
	
	@Column(name = "balance")
	private int balance;
	
	@Column(name = "accountType")
	private String accountType;
	
	@Column(name = "dateOfBirth")
	private Date dataOfBirth;
	
	@Column(name = "code")
	private String code;
	
	public AccountEntity() {}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accHolderName) {
		this.accountHolderName = accHolderName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Date getDataOfBirth() {
		return dataOfBirth;
	}

	public void setDataOfBirth(Date dataOfBirth) {
		this.dataOfBirth = dataOfBirth;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
}
