package com.ps.fescar.account.service.runner;

import com.ps.fescar.account.dao.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class CheckRunner implements CommandLineRunner {
    @Autowired
    private AccountRepository accountRepository;
    @Override
    public void run(String... args) throws Exception {
        boolean result = this.accountRepository.updateAccount("uid",10);
        System.out.println(result);
    }
}
