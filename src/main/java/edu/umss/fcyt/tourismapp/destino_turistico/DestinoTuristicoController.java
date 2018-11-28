package edu.umss.fcyt.tourismapp.destino_turistico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class DestinoTuristicoController {
    @Autowired
    private DestinoTuristicoService destinoTuristicoService;

    @GetMapping("/destinos-turisticos")
    public List<DestinoTuristico> index() {
        return destinoTuristicoService.getAll();
    }

    @GetMapping("/destinos-turisticos/{id}")
    public DestinoTuristico getOne(@PathVariable(value = "id") Long id) {
        return destinoTuristicoService.getDestinoTuristicoById(id);
    }

    @DeleteMapping("/destinos-turisticos/{id}")
    public ResponseEntity<?> deleteDestinoTuristicoById(@PathVariable(value = "id") Long id) {
        return destinoTuristicoService.deleteDestinoTuristico(id);
    }
}
