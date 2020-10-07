package com.dao;

import com.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountMapper {
    List<Account> findAll();
    Integer count();
}
