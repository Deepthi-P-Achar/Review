package com.reviews.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reviews.model.Product;
import com.reviews.model.Review;
import com.reviews.model.User;
import com.reviews.repository.ProductRepository;
import com.reviews.repository.UserRepository;
import com.reviews.service.ReviewService;


@RestController
@RequestMapping(value="/api/reviews/")
public class ReviewController {
	@Autowired
	ReviewService service;
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	ProductRepository productRepo;
		
	@GetMapping
	public ResponseEntity<List<Review>> findAllReviews(){
		return new ResponseEntity<>(service.findAllReviews(),HttpStatus.OK);
		
	}
	@PostMapping(value="/{userId}/{productId}")
	public ResponseEntity<Review> addReview(@RequestBody Review review, @PathVariable("userId") Long userId,@PathVariable("productId") Long productId){
		
		User user=userRepo.findById(userId).get();
		Product product=productRepo.findById(productId).get();
		review.setUser(user);
		review.setProduct(product);
		return new ResponseEntity<>(service.save(review),HttpStatus.OK);
	}
	
	@GetMapping(value="/{userId}")
	public ResponseEntity<List<Review>> getAllReviewsByUserId(@PathVariable("userId") Long userId){
		return new ResponseEntity<>(service.findByUserId(userId),HttpStatus.OK);
	}
	
	@GetMapping(value="/{productId}")
	public ResponseEntity<List<Review>> getAllReviewsByProductId(@PathVariable("productId") Long productId){
		return new ResponseEntity<>(service.findByproductId(productId),HttpStatus.OK);
	}
	
	

}
