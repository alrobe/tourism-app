/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umss.fcyt.tourismapp.location;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Lopez
 */
public class LocationService {
    
    @Autowired
    private LocationRepository locationRepository;
    
    public Location createLocation(Location location) {
        return locationRepository.save(location);
    }
    
    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }
}
