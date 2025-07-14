package com.javaproject.services.organization.repository;

import org.springframework.data.repository.CrudRepository;

import com.javaproject.services.organization.model.Organization;

public interface OrganizationRepository extends CrudRepository<Organization, String> {
	
}
