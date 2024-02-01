package com.example.demo.services;

import com.example.demo.entities.Users;

public interface UserService {
	//adds new user to database
	String addUser(Users user);
	
	//checks email is already present in database or not
	boolean checkEmail(String email);
	
	//validates users credentials
	boolean validateUser(String email, String password);
	
	//get users role by providing email
	String getUserRole(String email);
	
	//get user by providing email
	Users getUser(String email);
	
	//save updated user to database
	void updateUser(Users user);

}
