package com.fund.BankApp.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fund.BankApp.dao.AccountDAO;
import com.fund.BankApp.model.Account;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	AccountDAO accountDAO;
	
	@Override
	@Transactional
	public boolean saveAccount(Account account) {
		
		return accountDAO.saveAccount(account);
	}
	
	@Override
	@Transactional
	public List<Account> getAccounts() {
		return accountDAO.getAccounts();
	}

	@Override
	@Transactional
	public Account getAccount(Integer accountNo) {
		
		return accountDAO.getAccount(accountNo);
	}

	@Override
	@Transactional
	public boolean deleteAccount(int accountNo) {
		
		return accountDAO.deleteAccount(accountNo);
	}

}
