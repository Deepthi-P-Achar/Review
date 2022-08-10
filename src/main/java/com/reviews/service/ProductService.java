package com.reviews.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.reviews.model.Product;
import com.reviews.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository repo;

	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Product save(Product product) {
		// TODO Auto-generated method stub
		return repo.save(product);
	}

}
