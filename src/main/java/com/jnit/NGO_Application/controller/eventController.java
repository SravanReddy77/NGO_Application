
package com.jnit.NGO_Application.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jnit.NGO_Application.model.event;
import com.jnit.NGO_Application.model.user;
import com.jnit.NGO_Application.repository.eventRepository;

import com.jnit.NGO_Application.service.eventService;

@RestController
public class eventController implements eventService {
 private eventRepository eventRepository;

 public eventController(eventRepository eventRepository) {
     this.eventRepository = eventRepository;
 }
 @PostMapping("/saveEvent")
 public event createEvent(@RequestBody event newEvent) {
     return eventRepository.save(newEvent);
 }
@GetMapping("/getEvent")
 public event getEventById(int eventId) {
     return eventRepository.findById(eventId);
 }
@GetMapping("/events")
public List<event> getEvents() {	
	return eventRepository.findAll();
}
@PutMapping("/event/{id}")
public event updateEvent(@PathVariable Long id, @RequestBody event newEvent) {
	return eventRepository.findById(id).map(event -> {
		newEvent.setEventName(newEvent.getEventName());
		return eventRepository.save(newEvent);
	}).orElseThrow();
}
@DeleteMapping("/event")
 public void deleteEvent(@RequestBody event newEvent) {
     eventRepository.delete(newEvent);
 }
}
