package edu.umss.fcyt.tourismapp.circuito_turistico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    public CircuitoTuristico update(CircuitoTuristico circuitoTuristico) {
        return circuitoTuristicoRepository.save(circuitoTuristico);
    }

    public ResponseEntity<?> deleteCircuitoTuristico(Long id) {
        CircuitoTuristico circuitoTuristico = circuitoTuristicoRepository.findById(id).get();
        circuitoTuristicoRepository.delete(circuitoTuristico);
        return ResponseEntity.ok().build();
    }
}
