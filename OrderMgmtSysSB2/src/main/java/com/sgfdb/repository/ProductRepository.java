package com.sgfdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgfdb.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
