package com.rakuten;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakuten.user.ContactMessage;

@Service
public class ContactService {
	
	@Autowired
	ContactRepository repository;
	
	void send(ContactMessage message) {
		repository.save(message);
		System.out.println("Run");
	}
}
