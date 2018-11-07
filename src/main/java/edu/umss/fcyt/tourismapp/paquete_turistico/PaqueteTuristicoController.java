package edu.umss.fcyt.tourismapp.paquete_turistico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
public class PaqueteTuristicoController {
    @Autowired
    private PaqueteTuristicoService paqueteTuristicoService;

    @GetMapping("/paquetes")
    public List<PaqueteTuristico> index() {
        return paqueteTuristicoService.getAll();
    }

    @PostMapping("/paquete")
    public PaqueteTuristico create(@Valid @RequestBody PaqueteTuristico paqueteTuristico) {
        return paqueteTuristicoService.save(paqueteTuristico);
    }

    @GetMapping("/paquete/{id}")
    public PaqueteTuristico getOne(@PathVariable(value = "id") Long id) {
        return paqueteTuristicoService.getOne(id);
    }

    @DeleteMapping("/paquete/{id}")
    public ResponseEntity<?> deletePaquete(@PathVariable(value = "id") Long id) {
        return paqueteTuristicoService.deletePaquete(id);
    }
}
