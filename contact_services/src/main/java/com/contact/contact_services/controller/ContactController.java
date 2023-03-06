package com.contact.contact_services.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.contact_services.entity.Contact;
import com.contact.contact_services.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {

	@Autowired
	private ContactService contactService;
		
	@GetMapping("/getContactsByUserId/{userId}")
	public List<Contact> getContactsByUserId(@PathVariable("userId") Long userId){
		return contactService.getContactsByUserId(userId);
	}
}
