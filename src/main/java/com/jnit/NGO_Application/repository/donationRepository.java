package com.jnit.NGO_Application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jnit.NGO_Application.model.donation;
	@Repository
	public interface donationRepository extends JpaRepository<donation, Long> {
		public donation save(donation newDonation);

		public donation findById(int donationId);
		
		public List<donation> findAll();

//		public void update(donation donation);

		public void delete(donation donation);
	}



