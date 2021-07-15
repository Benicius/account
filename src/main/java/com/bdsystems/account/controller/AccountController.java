package com.bdsystems.account.controller;

import com.bdsystems.account.domains.Account;
import com.bdsystems.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/accounts")
public class AccountController {

    @Autowired
    private AccountService service;

    @GetMapping("/")
    public ResponseEntity<List<Account>> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @PostMapping("/save-account")
    public ResponseEntity<Account> saveAccount(@RequestBody Account account){
        return new ResponseEntity<>(service.saveAccount(account), HttpStatus.OK);
    }
}
