package com.ps.fescar.account.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ps.fescar.account.dao.repository.AccountRepository;
import com.ps.fescar.account.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@Service(timeout = 5000,interfaceClass = AccountService.class)
public class AccountServiceImpl implements AccountService {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private AccountRepository accountRepository;
    @Override
    public void debit(String userId, Integer money) {
        logger.info("userId:{}, money:{}", userId,money);
        boolean result = this.accountRepository.updateAccount(userId,money);
        logger.info("update account result:{}", result);
    }
}
