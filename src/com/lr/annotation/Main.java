package com.lr.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.lr.annotation.controller.UserController;
import com.lr.annotation.repository.UserRepository;
import com.lr.annotation.service.UserService;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-annotation.xml");
//		
//		TestObject testObject = (TestObject)ctx.getBean("testObject");
//		System.out.println("testObject");
//		
		UserController userController = (UserController)ctx.getBean("userController");
		System.out.println(userController);
		userController.execute();
//		
//		UserService userService = (UserService)ctx.getBean("userService");
//		System.out.println(userService);
		
//		UserRepository userRepository = (UserRepository)ctx.getBean("userRepository");
//		System.out.println(userRepository);
	}
}
