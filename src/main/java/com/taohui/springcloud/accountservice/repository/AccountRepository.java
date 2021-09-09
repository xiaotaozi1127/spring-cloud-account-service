package com.taohui.springcloud.accountservice.repository;

import com.taohui.springcloud.accountservice.entity.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends MongoRepository<Account, String> {
}
