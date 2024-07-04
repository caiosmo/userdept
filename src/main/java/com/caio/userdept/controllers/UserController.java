package com.caio.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caio.userdept.entities.User;
import com.caio.userdept.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")

public class UserController {
	
	@Autowired
	private UserRepository repository;

	@GetMapping
	public List<User> findAll() {
		List <User> result = repository.findAll();
		return result;
		
	}
	
	@PostMapping
	public User insert(@RequestBody User user){
		User result = repository.save(user);
		return result;
	}
}
