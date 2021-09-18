package com.iacollege1.services;

import java.util.List;

import com.iacollege1.entities.Users;

public interface UsersService {
 
		public List<Users> getAllUsers();
		
		public Users getAllUsers(long userid);
		
		public String addUser(Users users);
		
		public Users updateUser(Users users);
		
		public void deleteUser (long parseLong);
	}



