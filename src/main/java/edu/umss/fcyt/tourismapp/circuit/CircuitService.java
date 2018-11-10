package edu.umss.fcyt.tourismapp.circuit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CircuitService {
    @Autowired
    private CircuitRepository circuitRepository;

    public List<Circuit> getAll() {
        return circuitRepository.findAll();
    }
    public Optional<Circuit> get(Long id) {
        return circuitRepository.findById(id);
    }

}
