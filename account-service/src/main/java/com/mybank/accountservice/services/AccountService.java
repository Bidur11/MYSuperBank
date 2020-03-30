package com.mybank.accountservice.services;

import java.security.Principal;

public interface AccountService {

    void deposit(String accountType, double amount, Principal principal);
    void withdraw(String accountType, double amount, Principal principal);
}
