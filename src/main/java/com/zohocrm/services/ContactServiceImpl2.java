package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.zohocrm.entities.Contact;
import com.zohocrm.entities.Lead;
import com.zohocrm.repositoryes.ContactRepository2;

@Service
public class ContactServiceImpl2 implements ContactService2 {
	
	//here calling repository layer to service layer
	@Autowired
	private ContactRepository2 contactRepo;

	@Override
	public void saveContact(Contact contact) {
		contactRepo.save(contact);
		
	}

	@Override
	public List<Lead> findAllContact() {
		List<Contact> contacts = contactRepo.findAll();
		return contacts;
	}

	@Override
	public Contact getContact(long id) {
		Contact contact = contactRepo.getById(id);
		
		return contact;
	}

	
}
