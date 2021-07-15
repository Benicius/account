package com.bdsystems.account.service;

import com.bdsystems.account.domains.Account;
import com.bdsystems.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public List<Account> findAll(){
        return accountRepository.findAll();
    }

    public Account findById(String id){
        return accountRepository.findById(id).orElseThrow();
    }

    public Account saveAccount(Account account){
        return accountRepository.save(account);
    }
}
