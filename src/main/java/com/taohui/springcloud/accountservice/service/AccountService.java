package com.taohui.springcloud.accountservice.service;


import com.taohui.springcloud.accountservice.entity.Account;

public interface AccountService {
  Account findByName(String name);

}
