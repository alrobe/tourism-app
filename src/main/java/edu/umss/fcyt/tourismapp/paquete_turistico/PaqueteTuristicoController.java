package edu.umss.fcyt.tourismapp.paquete_turistico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class PaqueteTuristicoController {
    @Autowired
    private PaqueteTuristicoService paqueteTuristicoService;

    @GetMapping("/paquetes")
    public List<PaqueteTuristico> index() {
        return paqueteTuristicoService.getAll();
    }

    @GetMapping("/paquetes/{id}")
    public PaqueteTuristico getById(@PathVariable long id) {
        return paqueteTuristicoService.getById(id);
    }

    @PostMapping("/paquete")
    public PaqueteTuristico create(@Valid @RequestBody PaqueteTuristico paqueteTuristico) {
        return paqueteTuristicoService.save(paqueteTuristico);
    }
}
