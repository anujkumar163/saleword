package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Contact;
import com.zohocrm.entities.Lead;
import com.zohocrm.services.ContactService2;

@Controller
public class ContactController {
	
	@Autowired
	private ContactService2 contactService;
	
	@RequestMapping("/listallcontacts")
	public String listAllContact(ModelMap model) {
		List<Contact> contacts = contactService.findAllContact();
		model.addAttribute("contacts", contacts);
		return "contact_result";
	}
	
	@RequestMapping("/getContactById")
	public String getContactById(@RequestParam("id") long id, ModelMap model) {
		Contact contact = contactService.getContact(id);
		model.addAttribute("contact", contact);
		return "generate_bill";
	}
	
	
	
	
	
	
	
	
}
