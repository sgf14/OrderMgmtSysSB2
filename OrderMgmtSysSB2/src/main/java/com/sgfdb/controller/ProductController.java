package com.sgfdb.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgfdb.domain.Product;
import com.sgfdb.repository.ProductRepository;

@RestController
public class ProductController {
	
	private ProductRepository productRepository;
	
	@Autowired
	public ProductController(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	@GetMapping("/")
	public String home() {
		return ("Home");		
	}
	
	@GetMapping("/products")
	public List<Product> getProducts() {
		return productRepository.findAll();
	}
	
	@PostMapping("/products")
	public Product save(@RequestBody Product product) {
		
		return productRepository.saveAndFlush(product);
	}

}
