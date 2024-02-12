package com.jnit.NGO_Application.service;

import java.util.List;

import com.jnit.NGO_Application.model.donation;

public interface donationService {
	   donation createDonation(String username, String email, String password);
	   donation getDonationById(int donationId);
	   List<donation> getDonations();
//	    void updateDonation(donation donation);
//	    void deleteDonation(int donationId);
}
