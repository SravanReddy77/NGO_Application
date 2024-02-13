
package com.jnit.NGO_Application.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jnit.NGO_Application.model.donationtype;
import com.jnit.NGO_Application.repository.donationTypeRepository;

import com.jnit.NGO_Application.service.donationTypeService;

@RestController
public class donationTypeController implements donationTypeService {
 private donationTypeRepository donationTypeRepository;

 public donationTypeController(donationTypeRepository donationTypeRepository) {
     this.donationTypeRepository = donationTypeRepository;
 }
 @PostMapping("/saveDonationType")
 public donationtype createDonationType(@RequestBody donationtype newDonationType) {
     return donationTypeRepository.save(newDonationType);
 }
 @GetMapping("/getDonationType")
 public donationtype getDonationTypeById(int donationTypeId) {
     return donationTypeRepository.findById(donationTypeId);
 }
 @GetMapping("/donationTypes")
 public List<donationtype> getdonationtypes(){
	 return donationTypeRepository.findAll();
 }

// public void updateDonationType(donationtype donationType) {
//     donationTypeRepository.update(donationType);
// }

 @DeleteMapping("/donationType")
 public void deleteDonationType(@RequestBody donationtype newDonationType) {
     donationTypeRepository.delete(newDonationType);
 }
}
