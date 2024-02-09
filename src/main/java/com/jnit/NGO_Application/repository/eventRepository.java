package com.jnit.NGO_Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jnit.NGO_Application.model.event;

	
	@Repository
	public interface eventRepository extends JpaRepository<event, Long> {
		
		public event save(event event);

		public event findById(int eventId);

//		public void update(event event);

//		public void delete(int eventId);
	}



