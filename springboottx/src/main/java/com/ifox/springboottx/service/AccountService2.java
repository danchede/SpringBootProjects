package com.ifox.springboottx.service;

import com.ifox.springboottx.dao.AccountMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService2 {

    @Autowired
    private AccountMapper2 accountMapper2;

   @Transactional
    public void transfer() throws RuntimeException{
        accountMapper2.update(90,1);
        int i = 1/0;
        accountMapper2.update(110,2);
    }
}
