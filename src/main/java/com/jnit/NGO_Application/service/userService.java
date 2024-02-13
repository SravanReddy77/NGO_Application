
package com.jnit.NGO_Application.service;

import java.util.List;

import com.jnit.NGO_Application.model.user;

public interface userService {
	user createUser(user newUser);

	user getUserById(int userId);

	List<user> getUser();

//	void updateUser(user user);
//
	void deleteUser(user newUser);
}
