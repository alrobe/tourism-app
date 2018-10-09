/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umss.fcyt.tourismapp.destination;

import java.util.List;
import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Lopez
 */
public class DestinationService {

    @Autowired
    private DestinationRepository destinyRepository;

    public Destination createDestiny(Destination destiny) {
        return destinyRepository.save(destiny);
    }
    
    public Destination editDestination(long id) {
        Destination destiny = destinyRepository.getOne(id);
        if (destiny == null) {
            throw new EntityNotFoundException("Destiny with id:" + id +
                    "does not exist.!");
        }
        return destiny;
    }

    public List<Destination> getAllDestinations() {
        return destinyRepository.findAll();
    }
}
