package com.sivasankar.examples.sbr.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sivasankar.examples.sbr.model.Contact;

public interface ContactRepository extends CrudRepository<Contact, String>{
	public List<Contact> findByPhone(String phone);
}
