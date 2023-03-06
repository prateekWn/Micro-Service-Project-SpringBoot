package com.user.user_services.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.user_services.entity.Contact;
import com.user.user_services.entity.User;
import com.user.user_services.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
//	@Autowired
//	private FeignServiceUtil feignServiceUtil;

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/getUserByID/{id}")
	public User getUser(@PathVariable("id") Long id) {
		User person = userService.getUserById(id);
		List<Contact> listofContacts = this.restTemplate.getForObject("http://contact-services/contact/getContactsByUserId/"+person.getId() , List.class);
//		List<Contact> listofContacts = feignServiceUtil.getContactsByUserId(person.getId());
		person.setContacts(listofContacts);
		return person;
	}

	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable("id") Long userId) {
		userService.deleteUser(userId);
		return "Success";
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}
}
