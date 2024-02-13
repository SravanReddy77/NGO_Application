package com.jnit.NGO_Application.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jnit.NGO_Application.model.user;
import com.jnit.NGO_Application.repository.userRepository;

import com.jnit.NGO_Application.service.userService;

@RestController
public class userController implements userService {
 private userRepository userRepository;

 public userController(userRepository userRepository) {
     this.userRepository = userRepository;
 }
@PostMapping("/saveuser")
 public user createUser(@RequestBody user newUser) {
     return userRepository.save(newUser);
 }
@GetMapping("/getUser")
 public user getUserById(int userId) {
     return userRepository.findById(userId);
 }
@GetMapping("/users")
public List<user> getUser() {
	return userRepository.findAll();
	}
@PutMapping("/user/{id}")
public user updateUser(@PathVariable Long id, @RequestBody user newUser) {
	return userRepository.findById(id).map(user -> {
		newUser.setEmail(newUser.getEmail());
		return userRepository.save(newUser);
	}).orElseThrow();
}
@DeleteMapping("/user")
 public void deleteUser(@RequestBody user newUser) {
     userRepository.delete(newUser);
 }
}
