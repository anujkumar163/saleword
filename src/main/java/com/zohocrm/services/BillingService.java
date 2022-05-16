package com.zohocrm.services;

import org.springframework.stereotype.Service;

import com.zohocrm.entities.Billing;
@Service
public interface BillingService {
	public void generateoneBill(Billing bill);
}
