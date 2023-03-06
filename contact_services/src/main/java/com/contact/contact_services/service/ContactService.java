package com.contact.contact_services.service;

import java.util.List;

import com.contact.contact_services.entity.Contact;

public interface ContactService {

	List<Contact> getContactsByUserId(Long userId);

}
