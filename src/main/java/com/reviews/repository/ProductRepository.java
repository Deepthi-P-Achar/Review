package com.reviews.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reviews.model.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
