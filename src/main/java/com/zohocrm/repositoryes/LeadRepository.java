package com.zohocrm.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
