package com.demo.model;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    Long id;
    String address;
    Date createDate = new Date();
    Account account;
}
