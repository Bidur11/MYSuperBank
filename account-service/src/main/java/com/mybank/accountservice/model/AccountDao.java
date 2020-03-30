package com.mybank.accountservice.model;

import org.springframework.data.repository.CrudRepository;

public interface AccountDao extends CrudRepository<Account,Long> {
    Account findByAccountNumber(int accountNumber);
}
