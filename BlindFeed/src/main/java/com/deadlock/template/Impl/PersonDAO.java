package com.deadlock.template.Impl;

import java.util.List;

import com.deadlock.template.model.Person;
/*
 * data access object interface implements this interface DB handling
 * Update,delete method should include
 * */

public interface PersonDAO {
	public void insert(Person person);
	public List<Person> getPersonList();
}
