package com.lr.annotation.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository2Impl implements UserRepository{

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("UserRepository2Impl");
	}

}
