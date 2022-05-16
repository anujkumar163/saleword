package com.zohocrm.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entities.Contact;
import com.zohocrm.entities.Lead;

public interface ContactRepository2 extends JpaRepository<Contact, Long> {

}
