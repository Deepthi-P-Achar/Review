package com.reviews.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reviews.model.Product;
import com.reviews.service.ProductService;

@RestController
@RequestMapping(value="/api/products/")
public class ProductController {

@Autowired
ProductService service;
	
@GetMapping
public ResponseEntity<List<Product>> findAllProducts(){
	return new ResponseEntity<>(service.findAllProducts(),HttpStatus.OK);
	
}
@PostMapping
public ResponseEntity<Product> addProduct(@RequestBody Product product){
	return new ResponseEntity<>(service.save(product),HttpStatus.OK);
}



}
