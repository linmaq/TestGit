package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jpa.User;
import com.spring.jpa.UserDao;
import com.spring.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;
	@Autowired
	private UserDao dao;

	@RequestMapping("/addUser")
	public String addUser(String name, String pwd) {
		service.addUser(name, pwd);
		return "success";
	}
	
	@RequestMapping("/findAll")
	public List findAll() {
		return service.findAll();
	}
	
	@RequestMapping("/findJpa")
	public List<User> findJpa() {
		return dao.findAll();
	}
}
