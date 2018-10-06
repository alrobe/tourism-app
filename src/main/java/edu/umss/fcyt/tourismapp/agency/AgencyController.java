/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umss.fcyt.tourismapp.agency;

import edu.umss.fcyt.tourismapp.person.Person;
import edu.umss.fcyt.tourismapp.person.PersonService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alfredo Robles
 */
@RestController
@RequestMapping("/agency")
public class AgencyController {

    @Autowired
    private AgencyService agencyService;
    @Autowired
    private PersonService personService;

    @PostMapping("")
    public Agency createAgency(@Valid @RequestBody Agency agency) {
        Person person = personService.createPerson(agency.getPerson());
        agency.setPerson(person);
        return agencyService.createAgency(agency);
    }
}
