package com.zohocrm.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.zohocrm.entities.Billing;
import com.zohocrm.repositoryes.BillingRepository;

public class BillingServiceImpl implements BillingService {

	@Autowired
	private BillingRepository billingRepo;
	
	@Override
	public void generateoneBill(Billing bill) {
		billingRepo.save(bill);

	}

}
