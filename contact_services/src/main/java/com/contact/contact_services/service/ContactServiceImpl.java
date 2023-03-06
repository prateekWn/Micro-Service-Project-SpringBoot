package com.contact.contact_services.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.contact_services.entity.Contact;
import com.contact.contact_services.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepository;
	
	@Override
	public List<Contact> getContactsByUserId(Long userId) {
		return (List<Contact>) contactRepository.findByUserId(userId);
		}

}
