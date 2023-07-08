package com.demo.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Getter
@Setter
public class Category {
    @Id
    String id;
    String name;
}
