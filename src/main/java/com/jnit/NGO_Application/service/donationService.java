package com.jnit.NGO_Application.service;

import java.util.List;

import com.jnit.NGO_Application.model.donation;

public interface donationService {
	   donation createDonation(donation newDonation);
	   donation getDonationById(int donationId);
	   List<donation> getDonations();
//	    void updateDonation(donation donation);
//	    void deleteDonation(int donationId);
}
