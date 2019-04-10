package com.cts.homeservice.service;

import com.cts.homeservice.bean.User;

public interface UserService {
	
	public User authenticateUser(User user);
	public String addUser(User user);
	public int getLastId();
	public boolean checkUser(String email);

}
