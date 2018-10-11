/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umss.fcyt.tourismapp.destination;

import edu.umss.fcyt.tourismapp.location.Location;
import edu.umss.fcyt.tourismapp.location.LocationService;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Lopez
 */
@RestController
@RequestMapping("/destinations")
public class DestinationController {

    @Autowired
    private DestinationService destinationService;
    
    @Autowired
    private DestinationRepository dR;

    @Autowired
    private LocationService locationService;

    @PostMapping("")
    public Destination createDestination(@Valid @RequestBody Destination destination) {
        Location location = locationService.createLocation(destination.getLocation());
        destination.setLocation(location);
        return destinationService.createDestiny(destination);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateDestination(@RequestBody Destination destination, @PathVariable long id) {
        Optional<Destination> destinationOptional = destinationService.findById(id);
        if (!destinationOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        destination.setDestinyId(id);
        destinationService.editDestination(destination);
        return ResponseEntity.noContent().build();
    }
}
