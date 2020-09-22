package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Users;

public interface UsersRepository extends MongoRepository<Users, Integer>{
	
	public Users findById(String id);
		
}
