package com.sivasankar.examples.sbr.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sivasankar.examples.sbr.dao.ContactRepository;
import com.sivasankar.examples.sbr.model.Contact;

@Service
public class ContactService {

	@Autowired
	private ContactRepository contactRepository;

	public List<Contact> getAllContacts() {
		List<Contact> contacts = new ArrayList<>();
		contactRepository.findAll().forEach(contacts::add);
		return contacts;
	}

	public Contact getContact(String name) {
		return contactRepository.findOne(name);
	}

	public void addContact(Contact contact) {
		contactRepository.save(contact);
	}

	public void updateContact(Contact contact) {
		contactRepository.save(contact);
	}

	public void deleteContact(String name) {
		contactRepository.delete(name);
	}
}
