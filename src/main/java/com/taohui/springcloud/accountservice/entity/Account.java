package com.taohui.springcloud.accountservice.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "account")
@Data
@Builder
public class Account {
  @Id
  private String name;
  private Date lastSeen;
  private String note;

}
