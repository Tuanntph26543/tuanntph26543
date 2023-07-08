package com.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Product {
    Integer id;
    String name;
    Integer price;
    Category category;
    String image;
}
