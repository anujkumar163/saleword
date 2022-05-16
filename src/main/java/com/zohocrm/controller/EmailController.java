package com.zohocrm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.utility.EmailService;

@Controller
public class EmailController {
	
	//to send an email create an object of an utility interface class in controlleremail
	private EmailService emailService;
	
	@RequestMapping("/compose")
	public String composeEmail(@RequestParam("emailId") String email,ModelMap model) {
		model.addAttribute("email", email);
		return "compose_email";
	}
	
	@RequestMapping("/sendEmail")
	public String sendEmail(@RequestParam("to") String to, @RequestParam("subject") String subject, @RequestParam("body") String body) {
		emailService.sendSimpleMessage(to, subject, body);
		return "compose_email";
	}
}
