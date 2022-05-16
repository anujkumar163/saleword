package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.Lead;

//for saving the lead data create service layer and interface
public interface LeadService {
	public void saveLead(Lead lead);

	public List<Lead> findAllLeads();

	public Lead getLead(long id);

	public void deleteLead(long id);
}
