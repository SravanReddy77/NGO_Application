
package com.jnit.NGO_Application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.jnit.NGO_Application.model.event;
import com.jnit.NGO_Application.repository.eventRepository;

import com.jnit.NGO_Application.service.eventService;


public class eventController implements eventService {
 private eventRepository eventRepository;

 public eventController(eventRepository eventRepository) {
     this.eventRepository = eventRepository;
 }
 @PostMapping("/saveEvent")
 public event createEvent(String username, String email, String password) {
     event newEvent = new event();
     return eventRepository.save(newEvent);
 }
 @GetMapping("/getEvent")
 public event getEventById(int eventId) {
     return eventRepository.findById(eventId);
 }
//
// public void updateEvent(event event) {
//     eventRepository.update(event);
// }

// public void deleteEvent(int eventId) {
//     eventRepository.delete(eventId);
// }
}
