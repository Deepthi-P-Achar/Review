package com.example.demo;

import static org.junit.Assert.assertEquals;


import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.reviews.model.Review;
import com.reviews.repository.ReviewRepository;
import com.reviews.service.ReviewService;

@RunWith(MockitoJUnitRunner.class)
public class ReviewServiceTest {
	
	@InjectMocks
	ReviewService service;
	
	@Mock
	ReviewRepository repo;
	
	@BeforeEach
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void findAllReviewsTest() {
		Review review=new Review();
		Mockito.when(repo.findAll()).thenReturn(Arrays.asList(review));
		List<Review> results=service.findAllReviews();
		assertEquals(results.size(),1);
	}
	

}
