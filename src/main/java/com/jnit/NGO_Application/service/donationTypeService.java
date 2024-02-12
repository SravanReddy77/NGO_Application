package com.jnit.NGO_Application.service;

import java.util.List;

import com.jnit.NGO_Application.model.donationtype;

public interface donationTypeService {
	   donationtype createDonationType(String username, String email, String password);
	   donationtype getDonationTypeById(int donationTypeId);
	   List<donationtype> getdonationtypes();
//	    void updateDonationType(donationtype donationType);
//	    void deleteDonationType(int donationTypeId);
}
