/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umss.fcyt.tourismapp.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alfredo Robles
 */
@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public Person createPerson(Person newPerson) {
        return personRepository.save(newPerson);
    }
}
