/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umss.fcyt.tourismapp.destination;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lopez
 */
@Service
public class DestinationService {

    @Autowired
    private DestinationRepository destinyRepository;

    public Destination createDestiny(Destination destiny) {
        return destinyRepository.save(destiny);
    }
    
    public Destination editDestination(Destination destination) {
        return destinyRepository.save(destination);
    }

    public List<Destination> getAllDestinations() {
        return destinyRepository.findAll();
    }
    
    public Optional<Destination> findById(long id) {
        return destinyRepository.findById(id);
    }
}
