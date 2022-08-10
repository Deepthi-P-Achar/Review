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

import com.reviews.model.User;
import com.reviews.service.UserService;

@RestController
@RequestMapping(value="/api/users/")
public class UserController {
	@Autowired
	UserService service;
		
	@GetMapping
	public ResponseEntity<List<User>> findAllReviews(){
		return new ResponseEntity<>(service.findAllUsers(),HttpStatus.OK);
		
	}
	@PostMapping
	public ResponseEntity<User> addProduct(@RequestBody User user){
		return new ResponseEntity<>(service.save(user),HttpStatus.OK);
	}

}
