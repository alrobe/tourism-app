/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umss.fcyt.tourismapp.agency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alfredo Robles
 */
@Service
public class AgencyService {

    @Autowired
    private AgencyRepository agencyRepository;

    public Agency createAgency(Agency newAgency) {
        return agencyRepository.save(newAgency); 
    }
}
