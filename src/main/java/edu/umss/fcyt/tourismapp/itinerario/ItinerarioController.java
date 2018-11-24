package edu.umss.fcyt.tourismapp.itinerario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItinerarioController {
    @Autowired
    private ItinerarioService itinerarioService;

    @GetMapping("/itinerarios/{id}")
    public Itinerary getOne(@PathVariable(value = "id") Long id) {
        return itinerarioService.getItineraryById(id);
    }
}
