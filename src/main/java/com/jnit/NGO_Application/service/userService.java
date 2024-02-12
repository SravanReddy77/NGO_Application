package com.jnit.NGO_Application.service;

import java.util.List;

import com.jnit.NGO_Application.model.user;

public interface userService {
	   user createUser(String first_name, String last_name, String email, String password, String role);
	    user getUserById(int userId);
	    List<user> getUser();
//	    void updateUser(user user);
//	    void deleteUser(int userId);
}
