
package com.jnit.NGO_Application.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jnit.NGO_Application.model.donation;
import com.jnit.NGO_Application.model.donationtype;
import com.jnit.NGO_Application.repository.donationRepository;

import com.jnit.NGO_Application.service.donationService;

@RestController
public class donationController implements donationService {
 private donationRepository donationRepository;

 public donationController(donationRepository donationRepository) {
     this.donationRepository = donationRepository;
 }
 @PostMapping("/saveDonation")
 public donation createDonation(@RequestBody donation newDonation) {
     return donationRepository.save(newDonation);
 }
 @GetMapping("/getDonation")
 public donation getDonationById(int donationId) {
     return donationRepository.findById(donationId);
 }
 
 @GetMapping("/donations")
 public List<donation> getDonations(){
	 return donationRepository.findAll();
 }
 @PutMapping("/donation/{id}")
 public donation updateDonation(@PathVariable Long id, @RequestBody donation newDonation) {
 	return donationRepository.findById(id).map(donation -> {
 		newDonation.setAmount(newDonation.getAmount());
 		return donationRepository.save(newDonation);
 	}).orElseThrow();
 }
 @DeleteMapping("/donation")
 public void deleteDonation(@RequestBody donation newDonation) {
     donationRepository.delete(newDonation);
 }
}
