package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.zohocrm.entities.Lead;
import com.zohocrm.repositoryes.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {
	
	//here calling repository layer to service layer
	@Autowired
	private LeadRepository leadRepo;
	
	@Override
	public void saveLead(Lead lead) {
		leadRepo.save(lead);

	}

	@Override
	public List<Lead> findAllLeads() {
		List<Lead> leads = leadRepo.findAll();
		
		return leads;
	}

	@Override
	public Lead getLead(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return null;
	}

	@Override
	public void deleteLead(long id) {
		leadRepo.deleteById(id);
		
	}

}
