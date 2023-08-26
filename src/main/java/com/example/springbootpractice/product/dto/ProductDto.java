package com.example.springbootpractice.product.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ProductDto {
    private String name;
    private int price;
    private int quantity;;
    private String pid;
    private String category;
}