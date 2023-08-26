package com.example.springbootpractice.product.entity;


import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@Table(name="product")
@DynamicUpdate
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false, length = 50)
    private int quantity;

    @Column(nullable = false,  unique = true)
    private String pid;

    @Column(nullable = false, length = 50)
    private String category;

}


