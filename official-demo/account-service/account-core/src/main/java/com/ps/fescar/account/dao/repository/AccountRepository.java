package com.ps.fescar.account.dao.repository;

import com.ps.fescar.account.dao.mapper.AccountTblMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountRepository {
    @Autowired
    private AccountTblMapper accountTblMapper;
    public boolean updateAccount(String userId, Integer money){
        return this.accountTblMapper.updateAccount(userId,money) == 1;
    }

}
