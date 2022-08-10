package com.reviews.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reviews.model.Review;
import com.reviews.repository.ReviewRepository;

@Service
public class ReviewService {

	@Autowired
	ReviewRepository repo;

	public List<Review> findAllReviews() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Review save(Review review) {
		// TODO Auto-generated method stub
		return repo.save(review);
	}

	public List<Review> findByUserId(Long userId) {
		// TODO Auto-generated method stub
		return repo.findByUserId(userId);
	}

	public List<Review> findByproductId(Long productId) {
		// TODO Auto-generated method stub
		return repo.findByProductId(productId);
	}

}
