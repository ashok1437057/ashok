package com.journaldev.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.journaldev.spring.dao.PersonDAO;
import com.journaldev.spring.model.Person;

@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonDAO personDAO1;

	
	/*
	 * public void setPersonDAO(PersonDAO personDAO) { this.personDAO = personDAO; }
	 */
	 

	@Override
	@Transactional
	public void addPerson(Person p) {
		personDAO1.addPerson(p);
	}

	@Override
	@Transactional
	public void updatePerson(Person p) {
		personDAO1.updatePerson(p);
	}

	@Override
	@Transactional
	public List<Person> listPersons() {
		return personDAO1.listPersons();
	}

	@Override
	@Transactional
	public Person getPersonById(int id) {
		return personDAO1.getPersonById(id);
	}

	@Override
	@Transactional
	public void removePerson(int id) {
		personDAO1.removePerson(id);
	}

}
