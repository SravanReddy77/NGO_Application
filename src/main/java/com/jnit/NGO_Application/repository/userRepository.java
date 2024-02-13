package com.jnit.NGO_Application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jnit.NGO_Application.model.user;

@Repository
public interface userRepository extends JpaRepository<user, Long> {
	
	public user save(user user);

//	public void update(user user);

	
	public user findById(int userId);
	
	public List<user> findAll();

	public void delete(int userId);

}
