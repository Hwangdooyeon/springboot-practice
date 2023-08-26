package com.example.springbootpractice;

import com.example.springbootpractice.product.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootPracticeApplicationTests {

    @Autowired
    ProductRepository productRepository;
    @Test
    void 프로덕트테스트(){

     System.out.println(productRepository.findAll().get(0).getKategore());
    }
}
