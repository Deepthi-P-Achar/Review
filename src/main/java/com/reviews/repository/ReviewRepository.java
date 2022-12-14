package com.reviews.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.reviews.model.Review;
@Repository
public interface ReviewRepository extends JpaRepository<Review,Long> {

	@Query(value="select r from Review r where user.userId=?1")
	public List<Review> findByUserId(Long userId);

	@Query(value="select r from Review r where user.prodcutId=?1")
	public List<Review> findByProductId(Long productId);

}
