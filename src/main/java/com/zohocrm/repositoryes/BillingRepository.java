package com.zohocrm.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entities.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
