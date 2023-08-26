package com.example.springbootpractice.product.controller;

import com.example.springbootpractice.member.entity.Member;
import com.example.springbootpractice.product.entity.Product;
import com.example.springbootpractice.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Id;
import java.util.List;

@Controller
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    
    @GetMapping("/member/product")
    public String product(Model model) {
        List<Product> products = productService.findProductByProduct();
        model.addAttribute("productList", products);
        return "/product/productlist";
    }
}