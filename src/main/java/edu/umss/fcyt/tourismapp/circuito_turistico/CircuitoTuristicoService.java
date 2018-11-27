package edu.umss.fcyt.tourismapp.circuito_turistico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CircuitoTuristicoService {
    @Autowired
    private CircuitoTuristicoRepository circuitoTuristicoRepository;

    public List<CircuitoTuristico> getAll() {
        return circuitoTuristicoRepository.findAll();
    }

    public CircuitoTuristico getCircuitoTuristicoById(Long id) { return circuitoTuristicoRepository.findById(id).get(); }
}
