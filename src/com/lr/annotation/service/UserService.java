package com.lr.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.lr.annotation.repository.UserRepository;

@Service
public class UserService {
	
	//如果有多个实现类，通过@Qualifier指定调用那个类
	@Autowired
	@Qualifier("userRepository2Impl")
	private UserRepository userRepository;
	
	public void add() {
		// TODO Auto-generated constructor stub
		System.out.println("UserService");
		userRepository.save();
	}
}
