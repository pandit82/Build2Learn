package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Users;
import com.example.demo.repository.UsersRepository;

@Service
public class UsersService {

	@Autowired
	private UsersRepository usersRepository;
	
	public Users createUser(Users users) {
		return usersRepository.save(users);
	}
	
	public void deleteUser(Users users) {
		usersRepository.delete(users);
	}
	
	public void deleteAll() {
		usersRepository.deleteAll();
	}

	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return usersRepository.findAll();
	}

	public Users findById(String userId) {
		return usersRepository.findById(userId);
	}
	
}