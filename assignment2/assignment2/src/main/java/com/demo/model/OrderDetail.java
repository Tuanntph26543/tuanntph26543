package com.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class OrderDetail {
    Long id;
    Integer price;
    Integer quantity;
    Product product;
    Order order;
}
