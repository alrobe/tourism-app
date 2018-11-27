package edu.umss.fcyt.tourismapp.circuito_turistico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class CircuitoTuristicoController {
    @Autowired
    private CircuitoTuristicoService circuitoTuristicoService;

    @GetMapping("/circuitos_turisticos")
    public List<CircuitoTuristico> index() {
        return circuitoTuristicoService.getAll();
    }

    @GetMapping("/circuitos_turisticos/{id}")
    public CircuitoTuristico getOne(@PathVariable(value = "id") Long id) {
        return circuitoTuristicoService.getCircuitoTuristicoById(id);
    }
}
