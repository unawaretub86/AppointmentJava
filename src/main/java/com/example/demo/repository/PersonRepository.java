package com.example.demo.repository;

import com.example.demo.entities.Person;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    Person getPersonById(long id);

    List<Person> getAllPersons();

    <S extends Person> S addPerson(S person);
}
