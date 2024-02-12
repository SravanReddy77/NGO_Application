package com.jnit.NGO_Application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jnit.NGO_Application.model.donationtype;

	@Repository
	public interface donationTypeRepository extends JpaRepository<donationtype, Long> {
		public donationtype save(donationtype newDonationType);
		public donationtype findById(int donationTypeId);
		
		public List<donationtype> findAll();
//		public void update(donationtype donationType);
//		public void delete(int donationTypeId);
	}

