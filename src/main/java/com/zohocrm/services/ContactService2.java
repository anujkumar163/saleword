package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.Contact;
import com.zohocrm.entities.Lead;

//for saving the lead data create service layer and interface
public interface ContactService2 {
	public void saveContact(Contact contact);

	public List<Lead> findAllContact();

	public Contact getContact(long id);

	
}
