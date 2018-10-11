package edu.umss.fcyt.tourismapp.touristpackage;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/package")
public class TouristPackageController {

    private TouristPackageRepository repository;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public TouristPackage getPackageById(@PathVariable Long id) {
        return repository.findById(id).get();
    }
}