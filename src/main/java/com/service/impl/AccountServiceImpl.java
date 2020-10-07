package com.service.impl;

import com.dao.AccountMapper;
import com.domain.Account;
import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    private AccountMapper accountMapper;
    @Autowired
    public void setAccountMapper(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }

    @Override
    public List<Account> findAll() {
        return accountMapper.findAll();
    }

    @Override
    public Integer count() {
        return accountMapper.count();
    }
}
