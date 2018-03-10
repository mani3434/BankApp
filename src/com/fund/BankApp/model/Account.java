package com.fund.BankApp.model;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fund.BankApp.validations.Code;

public class Account {

	@NotNull
	private Integer accountNo;
	
	@NotNull
	@Size(min=2, max=50, message="Invalid length for Account Holder Name")
	@Pattern(regexp="[A-za-z(\\s)]+",message="Invalid account Holder Name")
	private String accountHolderName;
	
	@NotNull(message = "balance amount is required")
	@Min(value=5000, message="Minimum balance must not be less than 5000")
	private Integer balance;
	
	@NotNull(message = "Account type can't be null")
	private String accountType;
	
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	@NotNull(message = "Date of birth can't be null")
	@Past(message="Account can't be created for a person not born")
	private Date dateOfBirth;
	
	@NotNull(message = "Code is requried")
	@Code(value="US", message="Code should start with USA ")
	private String code;

	public Account() {
		this.accountNo = 0;
		this.accountHolderName = "";
		this.balance = 0;
		this.accountType="";
		this.dateOfBirth= new Date();
		this.code="";
		
	}

	public Account(Integer accountNo, String name, Integer balance, String acType, Date dob, String code) {
		this.accountNo = accountNo;
		this.accountHolderName = name;
		this.balance = balance;
		this.accountType= acType;
		this.dateOfBirth = dob;
		this.code = code;
	
	}

	public Integer getAccountNo() {
		return accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
