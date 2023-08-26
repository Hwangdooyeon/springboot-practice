package com.example.springbootpractice.product.service;

import com.example.springbootpractice.product.entity.Product;
import org.springframework.boot.Banner;
import org.springframework.ui.Model;

import java.util.List;

public interface ProductService {

    List<Product> findProductByProduct();

    Product getFindBypid(String pid);

    void join(Product product);
}

