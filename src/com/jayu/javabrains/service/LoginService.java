package com.jayu.javabrains.service;

import java.util.HashMap;

import com.jayu.javabrains.dto.User;

public class LoginService {
	HashMap<String, String> users = new HashMap<String, String>();
	public LoginService(){
		users.put("johndeo", "Jhon Deo");
		users.put("jayu", "Jayshri");
		users.put("user1", "New User");
		
	}
	public boolean authenticate(String userId,String password){
		if(password == null || password.trim().equals("")){
			return false;
		}
		
		return true;
		
	}
	public User getUserDetails(String userId){
		User user = new User();
		user.setUserName(users.get(userId));
		user.setUserId(userId);
		return user;
	}
}
