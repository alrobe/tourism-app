package edu.umss.fcyt.tourismapp.itinerario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItinerarioService {
    @Autowired
    private ItinerarioRepository itinerarioRepository;

    public Itinerary getItineraryById(Long id) {
        return itinerarioRepository.findById(id).get();
    }
}
