package com.taohui.springcloud.accountservice.service;

import com.taohui.springcloud.accountservice.entity.Account;
import com.taohui.springcloud.accountservice.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

  @Autowired
  private AccountRepository accountRepository;

  @Override
  public Account findByName(String name) {
    return accountRepository.findById(name).orElse(null);
  }
}
