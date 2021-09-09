package com.taohui.springcloud.accountservice.controller;

import com.taohui.springcloud.accountservice.entity.Account;
import com.taohui.springcloud.accountservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

  @Autowired
  private AccountService accountService;

  @GetMapping(value = "/account/{name}")
  public Account getAccount(@PathVariable String name) {
    return accountService.findByName(name);
  }

}
