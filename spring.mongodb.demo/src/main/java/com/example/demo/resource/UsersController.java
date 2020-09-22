package com.example.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Users;
import com.example.demo.service.UsersService;

@RestController
@RequestMapping("/api/users")
public class UsersController {
	
	@Autowired
	UsersService usersService;
	
	@GetMapping("/register")
	public String showForm() {
		return "register_form";
	}
	
	@GetMapping("/all")
	public List<Users> getAll() {
		return usersService.findAll();
	}
	
	@GetMapping("/{id}")
	public Users getUserById(@PathVariable("id") String userId) {
		return usersService.findById(userId);
	}
			
	@GetMapping("/create")
	public Users saveUser(@RequestParam String id, @RequestParam String name, @RequestParam Long salary, @RequestParam String team) {
		Users user =usersService.createUser(new Users(id, name, team, salary));
		System.out.println("User Created Successfully");
		return user;
	}

	@GetMapping("/deleteAll")
	public void deleteAll() {
		usersService.deleteAll();
		System.out.println("Deleted all user successfully");
	}
	
	@GetMapping("/deleteUser")
	public void deleteUser(@RequestParam String id) {
		Users user = usersService.findById(id);
		if(user != null) {
			usersService.deleteUser(user);
			System.out.println("Deleted user successfully");
		}
	}

}
