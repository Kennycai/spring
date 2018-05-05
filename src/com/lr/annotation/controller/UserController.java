package com.lr.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.lr.annotation.service.UserService;

@org.springframework.stereotype.Controller
public class UserController {

	//通过@Autowired自动装配，形成关联关系
	@Autowired
	private UserService userService;
	
	public void execute() {
		System.out.println("UserController");
		userService.add();
	}
}
