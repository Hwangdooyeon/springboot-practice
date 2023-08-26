package com.example.springbootpractice.product.service;

import com.example.springbootpractice.product.entity.Product;
import com.example.springbootpractice.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class  ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findProductByProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product getFindBypid(String pid) {
        Optional<Product> productOptional = productRepository.findByPid(pid);
        return productOptional.orElse(null);
    }

    @Override
    public void join(Product product) {
        productRepository.save(product);
    }
}
