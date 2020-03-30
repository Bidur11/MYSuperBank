package com.mybank.accountservice.services;

import com.mybank.accountservice.model.Account;
import com.mybank.accountservice.model.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.security.Principal;


@Service
public class AccountServiceImpl implements AccountService {


    @Autowired
    private AccountDao accountDao;

    @Autowired
    private Account account;

    public void deposit(String accountType, double amount, Principal principal) {
            account.setAccountBalance(account.getAccountBalance().add(new BigDecimal(amount)));
            accountDao.save(account);
    }

    public void withdraw(String accountType, double amount, Principal principal) {
            account.setAccountBalance(account.getAccountBalance().subtract(new BigDecimal(amount)));
            accountDao.save(account);

        }
}