package com.example.demo.service;

import com.example.demo.entities.Person;
import com.example.demo.repository.PersonRepository;

import java.util.List;

public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAllPersons() {
        return personRepository.getAllPersons();
    }

    public Person getPersonById(int id) {
        return personRepository.getPersonById(id);
    }

    public void addPerson(Person person) {
        personRepository.addPerson(person);
    }
}
