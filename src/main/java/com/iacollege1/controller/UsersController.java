package com.iacollege1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestHeader;

import com.iacollege1.entities.Users;
import com.iacollege1.services.UsersService;

@Controller
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	@GetMapping("/users")
	public List<Users> getAllUsers() {
		
		return this.usersService.getAllUsers();
		
	}
	
	@GetMapping("")
	public String viewUsers() {
		return "users";
	}
	
	@GetMapping("/users/{userid}")
	public Users getAllUsers(@PathVariable String userid) {
		return this.usersService.getAllUsers(Long.parseLong(userid));
		
	}
	@PostMapping("/users")
	public String addUser(@RequestBody Users users) {
//		System.out.println("test");
		return this.usersService.addUser(users);
	}
	
	@PutMapping("/users")
	public Users updateUser(@RequestBody Users users) {
		
		return this.usersService.updateUser(users);
	}
	
	@DeleteMapping("/users/{userid}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable String userid){
		try {
			this.usersService.deleteUser(Long.parseLong(userid));
			return new ResponseEntity <> (HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity <> (HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		
	}
	
}

