package com.reviews.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name="Review")
public class Review {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long reviewId;
	private String reviewTitle;
	private String reviewText;
	@ManyToOne(targetEntity=User.class)
	@JoinColumn(name="user", referencedColumnName="userId")
	private User user;
	@ManyToOne(targetEntity=Product.class)
	@JoinColumn(name="product", referencedColumnName="productId")
	private Product product;
	@DateTimeFormat(iso = ISO.DATE_TIME, pattern ="yyyy-MM-dd" )   
	private LocalDate reviewDate;
	private int rating;
	public Review() {
	
	}
	public Review(String reviewTitle, String reviewText, User user, Product product, LocalDate reviewDate) {
		super();
		this.reviewTitle = reviewTitle;
		this.reviewText = reviewText;
		this.user = user;
		this.product = product;
		this.reviewDate = reviewDate;
	}
	
	public Long getReviewId() {
		return reviewId;
	}
	public void setReviewId(Long reviewId) {
		this.reviewId = reviewId;
	}
	public String getReviewTitle() {
		return reviewTitle;
	}
	public void setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle;
	}
	public String getReviewText() {
		return reviewText;
	}
	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public LocalDate getReviewDate() {
		return reviewDate;
	}
	public void setReviewDate(LocalDate reviewDate) {
		this.reviewDate = reviewDate;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	
	

}
