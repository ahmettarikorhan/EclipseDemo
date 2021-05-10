package com.mythredd.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mythredd.hrms.business.abstracts.UserService;
import com.mythredd.hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UserConntroller {
	
	private UserService userService;
	
	@Autowired
	public UserConntroller(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping
	public List<User> getAll(){
		return userService.getAll();
	}
	
}
