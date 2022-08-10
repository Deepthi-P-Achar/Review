package com.reviews.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reviews.model.User;
import com.reviews.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repo;

	@Transactional
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Transactional
	public User save(User user) {
		
		// TODO Auto-generated method stub
		return repo.save(user);
	}

}
