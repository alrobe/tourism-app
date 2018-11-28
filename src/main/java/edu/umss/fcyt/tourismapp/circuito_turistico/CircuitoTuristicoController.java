package edu.umss.fcyt.tourismapp.circuito_turistico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class CircuitoTuristicoController {
    @Autowired
    private CircuitoTuristicoService circuitoTuristicoService;

    @GetMapping("/circuitos-turisticos")
    public List<CircuitoTuristico> index() {
        return circuitoTuristicoService.getAll();
    }

    @GetMapping("/circuitos-turisticos/{id}")
    public CircuitoTuristico getOne(@PathVariable(value = "id") Long id) {
        return circuitoTuristicoService.getCircuitoTuristicoById(id);
    }

    @RequestMapping(
            value = "/circuitos-turisticos/{id}",
            method = RequestMethod.PUT
    )                                    //delete path
    public ResponseEntity<Object> update(@Valid @PathVariable Long id, @RequestBody CircuitoTuristico circuitoTuristico) {

        CircuitoTuristico circuito = circuitoTuristicoService.getCircuitoTuristicoById(id);
//        if (!circuitoTuristico.isPresent()) {
//            return ResponseEntity.notFound().build();
//        }

        circuito.setNombre(circuitoTuristico.getNombre());
        circuito.setDestinoTuristicos(circuitoTuristico.getDestinoTuristicos());
        CircuitoTuristico ct = circuitoTuristicoService.update(circuito);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/circuitos-turisticos/{id}")
    public ResponseEntity<?> deleteDestinoTuristicoById(@PathVariable(value = "id") Long id) {
        return circuitoTuristicoService.deleteCircuitoTuristico(id);
    }
}
